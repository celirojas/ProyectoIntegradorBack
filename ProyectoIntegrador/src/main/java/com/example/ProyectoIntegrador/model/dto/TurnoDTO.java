package com.example.ProyectoIntegrador.model.dto;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;

import java.time.LocalDateTime;

public class TurnoDTO {
    private Integer ID;
    private LocalDateTime fechaHora;
    private Odontologo odontologo;
    private Paciente paciente;

    //Métodos accesores

    public Integer getID() {
        return ID;
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
