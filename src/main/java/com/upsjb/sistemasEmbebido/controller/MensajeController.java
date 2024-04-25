package com.upsjb.sistemasEmbebido.controller;

import com.upsjb.sistemasEmbebido.dto.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensajeController {
    @MessageMapping("/envio")
    @SendTo("/root_webSocket/mensajes")
    public Mensaje envio(Mensaje mensaje){
        return Mensaje
                .builder()
                .identificador(mensaje.getIdentificador())
                .contenido(mensaje.getContenido())
                .build();
    }
}
