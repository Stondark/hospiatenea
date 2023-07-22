package com.hospiatenea.hospiatenea.projections;

import org.springframework.data.rest.core.config.Projection;
import com.hospiatenea.hospiatenea.entity.Especialidad;

@Projection(name = "customEspecialidad", types = Especialidad.class)
public interface EspecialidadProjection {
    Long getIdEspecialidad();
    String getNombre();
}
