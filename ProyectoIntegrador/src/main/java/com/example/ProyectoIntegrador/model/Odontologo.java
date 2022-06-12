package com.example.ProyectoIntegrador.model;

import javax.persistence.Entity;

@Entity
public class Odontologo {
    private Integer ID;
    private String nombre;
    private String apellido;
    private String matricula;

    //Constructores

    public Odontologo(Integer ID, String nombre, String apellido, String matricula) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public Odontologo() {
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
