package com.grupo14.wiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EquipoController {

    @GetMapping("/equipo1_4")
    public String equipo() {
        return "equipo";
    }
    
}
