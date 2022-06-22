package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.Turno;
import com.example.ProyectoIntegrador.model.dto.OdontologoDTO;
import com.example.ProyectoIntegrador.model.dto.TurnoDTO;

import java.util.Set;

public interface TurnoService {

    TurnoDTO agregar(TurnoDTO turnoDTO);

    Set<TurnoDTO> listar();
    TurnoDTO modificar(TurnoDTO turnoDTO);

    void eliminar(Integer id);
}
