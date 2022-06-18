package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.repository.OdontologoRepository;
import com.example.ProyectoIntegrador.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OdontologoServiceImpl implements OdontologoService {
    @Autowired
    private static OdontologoRepository odontologoRepository;


    @Override
    public Odontologo agregar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public List<Odontologo> listar() {
        return odontologoRepository.findAll();
    }

    @Override
    public Odontologo modificar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }
}
