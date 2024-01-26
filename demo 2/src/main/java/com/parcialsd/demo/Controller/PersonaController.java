package com.parcialsd.demo.Controller;

import com.parcialsd.demo.Model.Persona;
import com.parcialsd.demo.Servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/Person")
public class PersonaController {

    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping()
    public List<Persona> consultarTodo() {
        return personaServicio.consultarTodo();
    }

    @GetMapping("{id}")
    public Optional<Persona> consultarPorId(@PathVariable Long id) {
        return personaServicio.consultarPorId(id);
    }

    @PostMapping
    public Persona crear(@RequestBody Persona persona) {
        return personaServicio.crear(persona);
    }

    @PutMapping("{id}")
    public void modificar(@RequestBody Persona persona, @PathVariable Long id) {

    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id) {
        personaServicio.eliminar(id);
    }

}
