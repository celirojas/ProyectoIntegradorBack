package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.model.dto.OdontologoDTO;
import com.example.ProyectoIntegrador.model.dto.PacienteDTO;
import com.example.ProyectoIntegrador.repository.PacienteRepository;
import com.example.ProyectoIntegrador.service.PacienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private static PacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public PacienteDTO agregar(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
        return pacienteDTO;
    }

    @Override
    public Set<PacienteDTO> listar() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacienteDTOS = new HashSet<>();

        for (Paciente paciente: pacientes) {
            pacienteDTOS.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacienteDTOS;
    }

    @Override
    public PacienteDTO modificar(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
        return pacienteDTO;
    }

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    //Método genérico para guardar paciente
    public void guardarPaciente(PacienteDTO pacienteDTO){
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }
}
