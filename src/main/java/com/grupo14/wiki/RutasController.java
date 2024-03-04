package com.grupo14.wiki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipo-1-4")
public class RutasController {



  @GetMapping("")
  public ModelAndView equipo() {
    return new ModelAndView("equipo");
  }

  @GetMapping("/arquitectura")
  public ModelAndView arquitectura() {
    return new ModelAndView("arqui");
  }

  @GetMapping("/contacto")
  public ModelAndView contacto() {
    return new ModelAndView("contacto");
  }

  @GetMapping("/desarrollo")
  public ModelAndView desarrollo() {
    return new ModelAndView("desarrollo");
  }

  @GetMapping("/despliegue")
  public ModelAndView despliegue() {
    return new ModelAndView("despliegue");
  }

  @GetMapping("/proyecto")
  public ModelAndView proyecto() {
    return new ModelAndView("proyecto");
  }

  @GetMapping("/pruebas")
  public ModelAndView pruebas() {
    return new ModelAndView("pruebas");
  }

  @GetMapping("/requerimientos")
  public ModelAndView requerimientos() {
    return new ModelAndView("requerimientos");
  }

}