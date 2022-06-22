package com.example.ProyectoIntegrador.model.dto;

import com.example.ProyectoIntegrador.model.Paciente;

public class DomicilioDTO {
    private Integer ID;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;

    //JsonIgnore
    private Paciente paciente;

    //Métodos accesores

    public Integer getID() {
        return ID;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}