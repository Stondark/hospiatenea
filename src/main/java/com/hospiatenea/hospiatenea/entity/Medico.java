package com.hospiatenea.hospiatenea.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {
    
    @Id
    private Long cedula;
    private String nombre;
    private String apellido;
    private String consultorio;
    private String correo;

    @OneToMany(mappedBy = "idMedico")
    private List<Cita> citas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="especialidad_id")
    private Especialidad idEspecialidad;

    public Medico(){}

    public Medico(Long cedula, String nombre, String apellido, String consultorio, String correo,
            Especialidad idEspecialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
        this.idEspecialidad = idEspecialidad;
    }

    public Long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public String getCorreo() {
        return correo;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }


    
}
