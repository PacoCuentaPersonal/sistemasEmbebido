package com.upsjb.sistemasEmbebido.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Mensaje {
    private String identificador;
    private String contenido;
}
