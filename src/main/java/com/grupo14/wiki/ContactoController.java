package com.grupo14.wiki;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo14.wiki.Entities.Contacto;
import com.grupo14.wiki.Repositories.ContactoRepository;

import java.util.List;

@RestController
public class ContactoController {

    private final ContactoRepository contactoRepository;

    public ContactoController(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @GetMapping("/equipo-1-4/ver-contactos")
    public ResponseEntity<List<Contacto>> verContactos() {
        List<Contacto> contactos = (List<Contacto>) contactoRepository.findAll();
        return new ResponseEntity<>(contactos, HttpStatus.OK);
    }
}
