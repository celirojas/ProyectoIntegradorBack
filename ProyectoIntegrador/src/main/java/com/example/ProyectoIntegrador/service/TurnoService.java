package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.dto.TurnoDTO;

import java.util.Set;

public interface TurnoService {


    //Guardar
    TurnoDTO agregar(TurnoDTO turnoDTO);

    //Listar
    Set<TurnoDTO> listar();

    //Modificar por id
    //void modificar(TurnoDTO turnoDTO);

    //Eliminar por id
    void eliminar(Integer id);

    //Buscar por id
    TurnoDTO buscarPorId(Integer id);
}
