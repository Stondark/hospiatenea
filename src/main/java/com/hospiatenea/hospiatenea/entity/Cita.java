package com.hospiatenea.hospiatenea.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita
 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;
    private LocalDateTime fechaHora;
    private String telefono;

    @ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente idPaciente;

    @ManyToOne
    @JoinColumn(name="id_medico")
    private Medico idMedico;

    public Cita() {}

    public Cita(Long idCita, LocalDateTime fechaHora, String telefono, Paciente idPaciente, Medico idMedico) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.telefono = telefono;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public Long getIdCita() {
        return idCita;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getTelefono() {
        return telefono;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }




    
}
