package com.hospiatenea.hospiatenea.repository;

import org.springframework.data.repository.CrudRepository;
import com.hospiatenea.hospiatenea.projections.PacienteProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.hospiatenea.hospiatenea.entity.Paciente;

@RepositoryRestResource(collectionResourceRel = "paciente", path = "paciente", excerptProjection = PacienteProjection.class)
@CrossOrigin(origins = "*")
public interface PacienteInterface extends CrudRepository<Paciente, Long> {
}
