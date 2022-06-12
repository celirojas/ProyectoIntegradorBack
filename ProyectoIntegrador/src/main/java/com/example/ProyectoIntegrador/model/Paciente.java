package com.example.ProyectoIntegrador.model;


import javax.persistence.Entity;

@Entity
public class Paciente {
    private Integer ID;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    //Constructores

    public Paciente(Integer ID, String nombre, String apellido, Domicilio domicilio) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Paciente() {
    }

    //Métodos accesores

    public Integer getID() {
        return ID;
    }

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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}