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

    /*----------------------------------Atributos------------------------------------*/

    @Autowired
    OdontologoService odontologoService;


    //Listar

    @GetMapping("/lista")
    public ResponseEntity<List<Odontologo>> listarOdontologos(){
        return ResponseEntity.ok(odontologoService.listar());
    }


    //Guardar

    @PostMapping
    public ResponseEntity<Odontologo> agregarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.agregar(odontologo));
    }


    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el odontologo con el id: " + id);
    }


    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(odontologoService.buscarPorId(id));
    }

    //Modificar
    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody Odontologo odontologo){
        odontologoService.modificar(odontologo);
        return ResponseEntity.status(HttpStatus.OK).body("Se modifico el odontologo con el id: " + odontologo.getId());
    }


}
