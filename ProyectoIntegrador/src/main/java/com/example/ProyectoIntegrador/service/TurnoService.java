package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.exceptions.ResourceNotFoundException;
import com.example.ProyectoIntegrador.model.Turno;
import com.example.ProyectoIntegrador.model.dto.TurnoDTO;

import java.util.Set;

public interface TurnoService {


    //Guardar
    void agregar(TurnoDTO turnoDTO);

    //Listar
    Set<TurnoDTO> listar();

    //Modificar por id
    Turno modificar(Turno turno);

    //Eliminar por id
    void eliminar(Integer id);

    //Buscar por id
    TurnoDTO buscarPorId(Integer id) throws ResourceNotFoundException;
}
