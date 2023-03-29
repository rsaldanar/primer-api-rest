package com.jconfdominicana.spring.primerapirest.repository;

import com.jconfdominicana.spring.primerapirest.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @project: primer-api-rest
 * @author: rsaldanar
 * @date: 27/3/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
    Optional<Persona> findByName(String name);
}
