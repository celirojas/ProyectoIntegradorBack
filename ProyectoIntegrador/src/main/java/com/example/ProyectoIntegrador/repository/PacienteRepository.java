package com.example.ProyectoIntegrador.repository;

import com.example.ProyectoIntegrador.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
}
