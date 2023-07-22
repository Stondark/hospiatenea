package com.hospiatenea.hospiatenea.repository;

import org.springframework.data.repository.CrudRepository;
import com.hospiatenea.hospiatenea.projections.MedicoProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.hospiatenea.hospiatenea.entity.Medico;


@RepositoryRestResource(collectionResourceRel = "medico", path = "medico", excerptProjection = MedicoProjection.class)
@CrossOrigin(origins = "*")
public interface MedicoInterface extends CrudRepository<Medico, Long> {
}
