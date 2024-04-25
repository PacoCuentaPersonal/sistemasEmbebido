package com.upsjb.sistemasEmbebido.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razon_social;
    @Column(length = 200)
    private String direccion;
    @Column(unique = true,length = 150)
    private String ape_paterno;
    @Column(unique = true,length = 150)
    private String ape_Materno;
    @Column(unique = true,length = 8)
    private String dni;


}
