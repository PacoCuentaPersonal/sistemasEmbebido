package com.upsjb.sistemasEmbebido.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 150)
    private String razon_social;
    @CreatedDate
    private LocalDateTime create_at;
    @LastModifiedDate
    private LocalDateTime update_at;
    private boolean estado;


    @OneToOne
    @JoinColumn(name ="id_persona",foreignKey = @ForeignKey(name = "fk_cliente_persona"))
    private Persona  persona;
}
