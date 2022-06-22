package com.example.ProyectoIntegrador.repository;

import com.example.ProyectoIntegrador.model.Domicilio;
import com.example.ProyectoIntegrador.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
