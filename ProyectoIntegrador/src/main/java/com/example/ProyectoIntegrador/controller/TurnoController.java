package com.example.ProyectoIntegrador.controller;

import com.example.ProyectoIntegrador.model.dto.TurnoDTO;
import com.example.ProyectoIntegrador.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    TurnoService turnoService;

    @GetMapping("/lista")
    public ResponseEntity<Set<TurnoDTO>> listarTurnos(){
        return ResponseEntity.ok(turnoService.listar());
    }

    @PostMapping
    public ResponseEntity<?> agregarTurno(@RequestBody TurnoDTO turno){
        turnoService.agregar(turno);
        return ResponseEntity.status(HttpStatus.OK).body("Se ha guardado el turno correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id){
        turnoService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el turno con id = " + id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TurnoDTO> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(turnoService.buscarPorId(id));
    }

    //Faltan los put
}
