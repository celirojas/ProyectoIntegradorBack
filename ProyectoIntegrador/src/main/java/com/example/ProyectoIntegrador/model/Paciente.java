package com.example.ProyectoIntegrador.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer ID;

    private String nombre;
    private String apellido;
    private String dni;

    private LocalDate fechaAlta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "domicilio_id")
    private Domicilio domicilio;

    @OneToMany(mappedBy = "paciente") //Cómo se llama la propiedad en la clase con la que me estoy relacionando.
    @JsonIgnore
    private Set<Turno> turnos;

    //Constructores


    public Paciente(String nombre, String apellido, String dni, LocalDate fechaAlta, Domicilio domicilio, Set<Turno> turnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
        this.domicilio = domicilio;
        this.turnos = turnos;
    }

    public Paciente() {
    }

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

    public Set<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        this.turnos = turnos;
    }
}
