package com.jconfdominicana.spring.primerapirest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @project: primer-api-rest
 * @author: rsaldanar
 * @date: 27/3/23
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Entity
@Table(name = "sexo")
@Data
public class Sexo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sexo_id", nullable = false, unique = true)
    private Long sexoId;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "status")
    private boolean status;
}
