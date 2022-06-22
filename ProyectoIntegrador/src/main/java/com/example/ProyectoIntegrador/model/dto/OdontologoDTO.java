package com.example.ProyectoIntegrador.model.dto;

public class OdontologoDTO {

    private Integer ID;
    private String nombre;
    private String apellido;
    private String matricula;

    //Metodos accesores

    public Integer getId() {
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
