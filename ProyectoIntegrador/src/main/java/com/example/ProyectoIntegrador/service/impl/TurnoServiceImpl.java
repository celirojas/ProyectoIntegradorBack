package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Turno;
import com.example.ProyectoIntegrador.repository.TurnoRepository;
import com.example.ProyectoIntegrador.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TurnoServiceImpl implements TurnoService {
    @Autowired
    private static TurnoRepository turnoRepository;

    @Override
    public Turno agregar(Turno turno) {
        return turnoRepository.save(turno);
    }
}
