package com.gestiontareas.gestiontareas.Controller;

import com.gestiontareas.gestiontareas.Entity.MateriaEntity;
import com.gestiontareas.gestiontareas.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materia")
@CrossOrigin("*")
public class MateriaController {

    @Autowired
    private MateriaService servicio;


    @PostMapping("/crearmateria")
    public void crear (@RequestBody MateriaEntity materiaEntity){
        servicio.creartarea(materiaEntity);
    }

    @GetMapping("/listatarea")
    public List<MateriaEntity> lis (){
        return servicio.listatarea();
    }
}
