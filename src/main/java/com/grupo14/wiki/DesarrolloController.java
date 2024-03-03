package com.grupo14.wiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DesarrolloController {

    @GetMapping("/desarrollo")
    public String desarrollo() {
        return "desarrollo";
    }
    
}
