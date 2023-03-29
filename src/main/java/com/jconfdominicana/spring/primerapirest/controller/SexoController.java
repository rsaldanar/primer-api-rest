package com.jconfdominicana.spring.primerapirest.controller;

import com.jconfdominicana.spring.primerapirest.entity.Sexo;
import com.jconfdominicana.spring.primerapirest.repository.SexoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project: primer-api-rest
 * @author: rsaldanar
 * @date: 27/3/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@RestController
@RequestMapping("/api/utilapi/sexo")
public class SexoController {

    @Autowired
    SexoRepository sexoRepository;

    @GetMapping("/getsexos")
    @ResponseStatus(HttpStatus.OK)
    public List<Sexo> getAllSexo(){
        return (List<Sexo>) sexoRepository.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Sexo saveSexo(@RequestBody Sexo sexo){
        return sexoRepository.save(sexo);
    }

}
