package com.gestiontareas.gestiontareas.Controller;


import com.gestiontareas.gestiontareas.Dto.*;
import com.gestiontareas.gestiontareas.Entity.TareaEntity;
import com.gestiontareas.gestiontareas.IService.ITareaService;
import com.gestiontareas.gestiontareas.Service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
@CrossOrigin("*")
public class TareaController {

    @Autowired
    private ITareaService tareaService;
    @Autowired
    private TareaService service;

    @PostMapping("/usuario")
    public List<ResponseTareaDto> getTareasByUsuarioId(@RequestBody FiltroTareaDto filtroTareaDto) {
        return tareaService.getListTareasByUser(filtroTareaDto);
    }

    @PatchMapping("/tarea/{id}")
    public Boolean updateTask(@PathVariable Long id, @RequestBody TareaDto tareaDto) {
        return tareaService.updateTask(id, tareaDto);
    }

    @PostMapping("/filtro")
    public List<ListaTareaDto> obtener (@RequestBody FiltroTareaDTOJ fil){
        return service.obtener(fil.getIdentidad(), fil.getMateria());
    }

    @PostMapping("/guardartarea")
    public void guardar (@RequestBody AdicionarTareaDTO adicionarTareaDTO){

        service.adicionar(adicionarTareaDTO);
    }

}
