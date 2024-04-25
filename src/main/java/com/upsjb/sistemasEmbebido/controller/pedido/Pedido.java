package com.upsjb.sistemasEmbebido.controller.pedido;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pedido {
    @GetMapping("/pedido")
    public String pedido(Model model) {
        model.addAttribute("mensaje", "¡Hola desde el controlador!");
        return "pedido/pedido";
    }

}
