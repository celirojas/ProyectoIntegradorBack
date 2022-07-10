package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.exceptions.ResourceNotFoundException;
import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.repository.OdontologoRepository;
import com.example.ProyectoIntegrador.service.OdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    //Inyección de dependencia: para poder utilizar los métodos de nuestra interface Repository

    @Autowired
    OdontologoRepository odontologoRepository;

    /*-------------------------Métodos CRUD------------------------*/


    //Guardar
    @Override
    public Odontologo agregar(Odontologo odontologo) {
        odontologoRepository.save(odontologo);
        return odontologo;
    }

    //Listar
    @Override
    public List<Odontologo> listar() {
        return odontologoRepository.findAll();
    }


    //Modificar
    @Override
    public Odontologo modificar(Odontologo odontologo) {
            return odontologoRepository.save(odontologo);
    }


    //Eliminar por id
    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }


    //Buscar por id
    @Override
    public Odontologo buscarPorId(Integer id) throws ResourceNotFoundException {
        Odontologo odontologoEncontrado = odontologoRepository.findById(id).orElse(null);
        if(odontologoEncontrado != null){
            return odontologoEncontrado;
        }
        throw new ResourceNotFoundException("No se encontró el odontologo con el id: " + id);

    }
}
