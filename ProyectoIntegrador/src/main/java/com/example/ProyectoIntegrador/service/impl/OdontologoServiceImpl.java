package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Odontologo;
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

    @Autowired
    ObjectMapper mapper;


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

    //Modificar por id
    @Override
    public Odontologo modificar(Odontologo odontologo) {
        if(buscarPorId(odontologo.getId()) != null)
            return odontologoRepository.save(odontologo);
        else
            return null;
    }

    //Eliminar por id
    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    //Buscar por id
    @Override
    public Odontologo buscarPorId(Integer id) {
        Odontologo odontologoEncontrado = odontologoRepository.findById(id).orElse(null);
        return odontologoEncontrado;


//    //Método genérico para guardar odontologo
//    public void guardarOdontologo(OdontologoDTO odontologoDTO){
//        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
//        odontologoRepository.save(odontologo);
//    }
    }
}
