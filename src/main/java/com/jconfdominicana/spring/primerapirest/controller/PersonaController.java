package com.jconfdominicana.spring.primerapirest.controller;


import com.jconfdominicana.spring.primerapirest.entity.Persona;
import com.jconfdominicana.spring.primerapirest.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @project: primer-api-rest
 * @author: rsaldanar
 * @date: 27/3/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/getpersonas")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> getAllPersona(){
        return (List<Persona>) personaRepository.findAll();
    }

    @GetMapping("/getname/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> getPersonaByName(@PathVariable("name") String name){
        Optional<Persona> optionalPersona = personaRepository.findByName(name);
        if (!optionalPersona.isPresent()){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(optionalPersona.get());
        }
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona savePersona(@RequestBody Persona persona){
        return personaRepository.save(persona);
    }

}
