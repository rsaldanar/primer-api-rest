package com.jconfdominicana.spring.primerapirest.repository;

import com.jconfdominicana.spring.primerapirest.entity.Sexo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @project: primer-api-rest
 * @author: rsaldanar
 * @date: 27/3/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Repository
public interface SexoRepository extends CrudRepository<Sexo, Long> {
}
