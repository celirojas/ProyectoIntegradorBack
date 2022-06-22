package com.example.ProyectoIntegrador.service;


import com.example.ProyectoIntegrador.model.dto.OdontologoDTO;
import java.util.Set;

public interface OdontologoService {

    OdontologoDTO agregar(OdontologoDTO odontologoDTO);
    Set<OdontologoDTO> listar();
    OdontologoDTO modificar(OdontologoDTO odontologoDTO);
    void eliminar(Integer id);
}
