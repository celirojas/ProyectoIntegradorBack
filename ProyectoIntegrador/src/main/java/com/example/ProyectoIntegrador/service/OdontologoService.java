package com.example.ProyectoIntegrador.service;


import com.example.ProyectoIntegrador.exceptions.ResourceNotFoundException;
import com.example.ProyectoIntegrador.model.Odontologo;

import java.util.List;

public interface OdontologoService {

    //Guardar

    Odontologo agregar(Odontologo odontologo);

    //Listar
    List<Odontologo> listar();

    //Modificar por id
    Odontologo modificar(Odontologo odontologo);

    //Eliminar por id
    void eliminar(Integer id);

    //Buscar por id
    Odontologo buscarPorId(Integer id) throws ResourceNotFoundException;
}
