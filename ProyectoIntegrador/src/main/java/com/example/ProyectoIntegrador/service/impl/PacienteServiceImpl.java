package com.example.ProyectoIntegrador.service.impl;

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


    //Métodos CRUD

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

    //Modificar por id
    @Override
    public Paciente modificar(Paciente paciente) {
        if(buscarPorId(paciente.getId()) != null)
            return pacienteRepository.save(paciente);
        else
            return null;
    }

    //Eliminar por id
    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }


    //Buscar por id
    @Override
    public Paciente buscarPorId(Integer id) {
        Paciente pacienteEncontrado = pacienteRepository.findById(id).orElse(null);
        return pacienteEncontrado;
    }




    //Método genérico para guardar paciente
//    public void guardarPaciente(PacienteDTO pacienteDTO){
//        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
//        pacienteRepository.save(paciente);
//    }
}
