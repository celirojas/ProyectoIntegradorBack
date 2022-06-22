package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.model.dto.PacienteDTO;

import java.util.List;
import java.util.Set;

public interface PacienteService {

    PacienteDTO agregar(PacienteDTO pacienteDTO);
    Set<PacienteDTO> listar();
    PacienteDTO modificar(PacienteDTO pacienteDTO);
    void eliminar(Integer id);
}
