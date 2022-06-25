package com.example.ProyectoIntegrador.controller;


import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.dto.OdontologoDTO;
import com.example.ProyectoIntegrador.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    OdontologoService odontologoService;

    @GetMapping("/lista")
    public ResponseEntity<Set<OdontologoDTO>> listarOdontologos(){
        return ResponseEntity.ok(odontologoService.listar());
    }

    @PostMapping
    public ResponseEntity<OdontologoDTO> agregarOdontologo(@RequestBody OdontologoDTO odontologo){
        return ResponseEntity.ok(odontologoService.agregar(odontologo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el odontologo");
    }

    //Agrega un odontologo nuevo porque no le puedo pasar id
    @PutMapping
    public ResponseEntity<OdontologoDTO> modificarOdontologo(@RequestBody OdontologoDTO odontologo){
        return ResponseEntity.ok(odontologoService.modificar(odontologo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OdontologoDTO> modificarOdontologoAlt(@RequestBody OdontologoDTO odontologo, @PathVariable Integer id){
        return ResponseEntity.ok(odontologoService.modificarAlt(odontologo, id));
    }


}
