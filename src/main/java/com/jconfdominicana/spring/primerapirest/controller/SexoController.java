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
@RequestMapping("/api/v1/sexo")
public class SexoController {

    @Autowired
    SexoRepository sexoRepository;

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<Sexo> getAllSexo(){
        return (List<Sexo>) sexoRepository.findAll();
    }

    @GetMapping("/id/{sexo_id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Sexo> sexoActivo(@PathVariable("sexo_id") Long sexoId){
        return (List<Sexo>) sexoRepository.findByStatus(true, sexoId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Sexo saveSexo(@RequestBody Sexo sexo){
        return sexoRepository.save(sexo);
    }

}
