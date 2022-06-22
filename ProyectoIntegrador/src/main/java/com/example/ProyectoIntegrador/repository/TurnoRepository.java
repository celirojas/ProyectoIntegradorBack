package com.example.ProyectoIntegrador.repository;

import com.example.ProyectoIntegrador.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno,Integer> {

}
