package com.example.ProyectoIntegrador.model.dto;

import com.example.ProyectoIntegrador.model.Domicilio;

import java.time.LocalDate;

public class PacienteDTO {

    private String nombre;
    private String apellido;
    private String dni;

    private LocalDate fechaAlta;

    private Domicilio domicilio;

    //Métodos accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
