package com.hospiatenea.hospiatenea.projections;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;

import com.hospiatenea.hospiatenea.entity.Especialidad;
import com.hospiatenea.hospiatenea.entity.Medico;

@Projection(name = "customMedico", types = Medico.class)
public interface MedicoProjection {
    Long getCedula();
    String getNombre();
    String getApellido();
    String getConsultorio();
    String getCorreo();
    Especialidad getIdEspecialidad();

}
