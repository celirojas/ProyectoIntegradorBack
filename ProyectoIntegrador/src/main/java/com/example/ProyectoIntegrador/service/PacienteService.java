package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;

import java.util.List;

public interface PacienteService {

    Paciente agregar(Paciente paciente);
    List<Paciente> listar();
    Paciente modificar(Paciente paciente);
    void eliminar(Integer id);
}
