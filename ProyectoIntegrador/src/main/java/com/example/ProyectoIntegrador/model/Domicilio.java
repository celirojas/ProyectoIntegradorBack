package com.example.ProyectoIntegrador.model;

import javax.persistence.*;

@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer ID;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;

    @OneToOne
    //JsonIgnore y mappedBy
    private Paciente paciente;

    //Constructores


    public Domicilio(String calle, int numero, String localidad, String provincia, Paciente paciente) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
        this.paciente = paciente;
    }

    public Domicilio() {
    }

    //Métodos accesores

    public int getId() {
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
}
