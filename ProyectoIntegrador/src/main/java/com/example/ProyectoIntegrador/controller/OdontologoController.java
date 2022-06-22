package com.example.ProyectoIntegrador.controller;


import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @GetMapping("/lista")
    public ResponseEntity<List> listarOdontologos(){
        return ResponseEntity.ok(odontologoService.listar());
    }

    @PostMapping
    public ResponseEntity<Odontologo> agregarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.agregar(odontologo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el odontologo");
    }

    @PutMapping
    public ResponseEntity<Odontologo> modificarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.modificar(odontologo));
    }


}
