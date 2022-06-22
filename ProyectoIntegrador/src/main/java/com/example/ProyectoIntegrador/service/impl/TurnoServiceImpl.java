package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.model.Turno;
import com.example.ProyectoIntegrador.model.dto.PacienteDTO;
import com.example.ProyectoIntegrador.model.dto.TurnoDTO;
import com.example.ProyectoIntegrador.repository.TurnoRepository;
import com.example.ProyectoIntegrador.service.TurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class TurnoServiceImpl implements TurnoService {
    @Autowired
    private static TurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public TurnoDTO agregar(TurnoDTO turnoDTO) {
        guardarTurno(turnoDTO);
        return turnoDTO;
    }

    @Override
    public Set<TurnoDTO> listar() {
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDTO> turnoDTOS = new HashSet<>();

        for (Turno turno: turnos) {
            turnoDTOS.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return turnoDTOS;
    }

    @Override
    public TurnoDTO modificar(TurnoDTO turnoDTO) {
        guardarTurno(turnoDTO);
        return turnoDTO;
    }

    @Override
    public void eliminar(Integer id) {
        turnoRepository.deleteById(id);
    }


    //Método genérico para guardar turno
    public void guardarTurno(TurnoDTO turnoDTO){
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }
}
