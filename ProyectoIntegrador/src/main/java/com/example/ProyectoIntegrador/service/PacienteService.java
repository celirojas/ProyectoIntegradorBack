package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.Paciente;

import java.util.List;

public interface PacienteService {

    //Guardar

    Paciente agregar(Paciente paciente);

    //Listar
    List<Paciente> listar();

    //Modificar por id
    Paciente modificar(Paciente paciente);

    //Eliminar por id
    void eliminar(Integer id);

    //Buscar por id
    Paciente buscarPorId(Integer id);
}
