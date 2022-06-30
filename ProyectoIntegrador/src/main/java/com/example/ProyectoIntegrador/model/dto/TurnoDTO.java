package com.example.ProyectoIntegrador.model.dto;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TurnoDTO {

    private Integer id;
    private LocalDateTime fechaHora;
    private Odontologo odontologo;
    private Paciente paciente;

    //Métodos accesores

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
