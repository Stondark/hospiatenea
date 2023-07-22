package com.hospiatenea.hospiatenea.projections;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;
import com.hospiatenea.hospiatenea.entity.Paciente;

@Projection(name = "customPaciente", types = Paciente.class)
public interface PacienteProjection {
    Long getCedula();
    String getNombre();
    String getApellido();
    LocalDate getFechaNacimiento();
}
