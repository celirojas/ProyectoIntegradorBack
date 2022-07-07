package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.exceptions.ResourceNotFoundException;
import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.repository.PacienteRepository;
import com.example.ProyectoIntegrador.service.PacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PacienteServiceImpl implements PacienteService {

    //Inyección de dependencia: para poder utilizar los métodos de nuestra interface Repository

    @Autowired
    PacienteRepository pacienteRepository;


    /*-------------------------Métodos CRUD------------------------*/

    //Guardar
    @Override
    public Paciente agregar(Paciente paciente) {
        pacienteRepository.save(paciente);
        return paciente;
    }

    //Listar
    @Override
    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    //Modificar
    @Override
    public Paciente modificar(Paciente paciente) {
            return pacienteRepository.save(paciente);
    }

    //Eliminar por id
    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }


    //Buscar por id
    @Override
    public Paciente buscarPorId(Integer id) throws ResourceNotFoundException {

        Paciente pacienteEncontrado = pacienteRepository.findById(id).orElse(null);
        if(pacienteEncontrado != null){
            return pacienteEncontrado;
        }
        throw new ResourceNotFoundException("No se encontró el paciente con el id: " + id);
    }



}
