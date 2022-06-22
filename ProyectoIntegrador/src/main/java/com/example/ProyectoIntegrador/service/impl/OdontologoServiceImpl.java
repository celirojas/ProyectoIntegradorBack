package com.example.ProyectoIntegrador.service.impl;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.dto.OdontologoDTO;
import com.example.ProyectoIntegrador.repository.OdontologoRepository;
import com.example.ProyectoIntegrador.service.OdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OdontologoServiceImpl implements OdontologoService {
    @Autowired
    private static OdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public OdontologoDTO agregar(OdontologoDTO odontologoDTO) {
        //Transformar el odontologoDTO en odontologo
        guardarOdontologo(odontologoDTO);
        return odontologoDTO;
    }

    @Override
    public Set<OdontologoDTO> listar() {

        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologoDTOS = new HashSet<>();

        for (Odontologo odontologo: odontologos) {
            odontologoDTOS.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        return odontologoDTOS;
    }

    @Override
    public OdontologoDTO modificar(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
        return odontologoDTO;
    }

    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    //Método genérico para guardar odontologo
    public void guardarOdontologo(OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }
}
