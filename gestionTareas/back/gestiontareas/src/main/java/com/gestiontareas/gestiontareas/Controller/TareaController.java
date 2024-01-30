package com.gestiontareas.gestiontareas.Controller;


import com.gestiontareas.gestiontareas.Dto.FiltroTareaDto;
import com.gestiontareas.gestiontareas.Dto.ResponseTareaDto;
import com.gestiontareas.gestiontareas.Dto.TareaDto;
import com.gestiontareas.gestiontareas.Entity.TareaEntity;
import com.gestiontareas.gestiontareas.IService.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarea")
public class TareaController {

    @Autowired
    private ITareaService tareaService;

    @PostMapping("/usuario")
    public List<ResponseTareaDto> getTareasByUsuarioId(@RequestBody FiltroTareaDto filtroTareaDto) {
        return tareaService.getListTareasByUser(filtroTareaDto);
    }

    @PatchMapping("/tarea/{id}")
    public Boolean updateTask(@PathVariable Long id, @RequestBody TareaDto tareaDto) {
        return tareaService.updateTask(id, tareaDto);
    }


}
