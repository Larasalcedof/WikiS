package com.grupo14.wiki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo14.wiki.Entities.Contacto;
import com.grupo14.wiki.Repositories.ContactoRepository;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/equipo-1-4")
public class RutasController {

    @Autowired
    private ContactoRepository contactoRepository;



  @GetMapping("")
  public ModelAndView equipo() {
    return new ModelAndView("equipo");
  }

  @GetMapping("/contacto")
  public ModelAndView contacto() {
    return new ModelAndView("contacto");
  }

  @GetMapping("/arq")
  public ModelAndView prueba() {
    return new ModelAndView("prueba");
  }

  @GetMapping("/arquitectura")
  public ModelAndView arqui() {
    return new ModelAndView("arqui");
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

  @PostMapping("/form")
    public ModelAndView procesarFormulario(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellidos") String apellidos,
            @RequestParam("correo") String correo,
            @RequestParam("semestre") int semestre,
            @RequestParam("descripcion") String descripcion) {


        // Crea un objeto Contacto y asigna los valores
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setApellidos(apellidos);
        contacto.setCorreo(correo);
        contacto.setSemestre(semestre);
        contacto.setDescripcion(descripcion);

        // Guarda el contacto en la base de datos
        contactoRepository.save(contacto);

        // Puedes agregar lógica adicional, redireccionar a otra página, etc.
        return new ModelAndView("redirect:/equipo-1-4/contacto");
    }
}


    