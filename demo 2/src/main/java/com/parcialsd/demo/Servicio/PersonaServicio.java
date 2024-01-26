package com.parcialsd.demo.Servicio;

import com.parcialsd.demo.Conexion.PersonaRepositorio;
import com.parcialsd.demo.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

    @GetMapping()
    public List<Persona> consultarTodo() {
        return personaRepositorio.findAll();
    }

    @GetMapping("{id}")
    public Optional<Persona> consultarPorId(@PathVariable Long id) {
        return personaRepositorio.findById(id);
    }

    @PostMapping
    public Persona crear(@RequestBody Persona persona) {
        return personaRepositorio.save(persona);
    }

    @PutMapping("{id}")
    public void modificar(@RequestBody Persona persona, @PathVariable Long id) {

    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id) {
        personaRepositorio.deleteById(id);
    }

}
