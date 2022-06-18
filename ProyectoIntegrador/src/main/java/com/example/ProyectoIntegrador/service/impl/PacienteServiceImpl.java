package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.repository.PacienteRepository;
import com.example.ProyectoIntegrador.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private static PacienteRepository pacienteRepository;

    @Override
    public Paciente agregar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente modificar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
