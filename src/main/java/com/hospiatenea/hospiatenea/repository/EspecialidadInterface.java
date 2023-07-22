package com.hospiatenea.hospiatenea.repository;

import org.springframework.data.repository.CrudRepository;
import com.hospiatenea.hospiatenea.projections.EspecialidadProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.hospiatenea.hospiatenea.entity.Especialidad;

@RepositoryRestResource(collectionResourceRel = "especialidad", path = "especialidad", excerptProjection = EspecialidadProjection.class)
@CrossOrigin(origins = "*")
public interface EspecialidadInterface extends CrudRepository<Especialidad, Long> {
}
