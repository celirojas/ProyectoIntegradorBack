package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.Odontologo;

import java.util.List;

public interface OdontologoService {

    Odontologo agregar(Odontologo odontologo);
    List<Odontologo> listar();
    Odontologo modificar(Odontologo odontologo);
    void eliminar(Integer id);
}
