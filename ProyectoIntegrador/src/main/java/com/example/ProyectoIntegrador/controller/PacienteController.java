package com.example.ProyectoIntegrador.controller;


import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    /*----------------------------------Atributos------------------------------------*/

    @Autowired
    PacienteService pacienteService;


    //Listar

    @GetMapping("/lista")
    public ResponseEntity<List<Paciente>> listarPaciente(){
        return ResponseEntity.ok(pacienteService.listar());
    }

    //Guardar

    @PostMapping
    public ResponseEntity<Paciente> agregarPaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.agregar(paciente));
    }


    //Eliminar por id

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Integer id){
        pacienteService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el paciente con el id: " + id);
    }


    //Buscar por id

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(pacienteService.buscarPorId(id));
    }



    //Modificar
    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody Paciente paciente){
        pacienteService.modificar(paciente);
        return ResponseEntity.status(HttpStatus.OK).body("Se modifico el paciente con el id: " + paciente.getId());
    }


}
