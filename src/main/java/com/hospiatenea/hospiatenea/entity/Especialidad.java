package com.hospiatenea.hospiatenea.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;

    private String nombre;
    
    @OneToMany(mappedBy = "idEspecialidad")
    private List<Medico> medicos = new ArrayList<>();

    public Especialidad(){};

    public Especialidad(Long idEspecialidad, String nombre) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }
    public String getNombre() {
        return nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    

}
