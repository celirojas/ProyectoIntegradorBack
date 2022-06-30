package com.example.ProyectoIntegrador.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="turnos")
public class Turno {

    /*----------------------------------Atributos------------------------------------*/

    @Id
    @SequenceGenerator(name = "turno_sequence", sequenceName = "turno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turno_sequence")
    private Integer id;

    @ManyToOne
    @JoinColumn(name= "paciente_id", nullable = false) //Clave foránea. Nunca podrá ser nula
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name= "odontologo_id", nullable = false) //Clave foránea. Nunca podrá ser nula
    private Odontologo odontologo;


    private LocalDateTime fechaHora;

    //Constructores

    public Turno() {
    }

    public Turno(Integer id, Paciente paciente, Odontologo odontologo, LocalDateTime fechaHora) {
        this.id = id;
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaHora = fechaHora;
    }

    public Turno(Paciente paciente, Odontologo odontologo, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaHora = fechaHora;
    }


    //Getters y setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
