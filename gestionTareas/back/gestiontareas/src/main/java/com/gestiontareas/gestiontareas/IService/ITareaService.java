package com.gestiontareas.gestiontareas.IService;

import com.gestiontareas.gestiontareas.Dto.FiltroTareaDto;
import com.gestiontareas.gestiontareas.Dto.ResponseTareaDto;
import com.gestiontareas.gestiontareas.Dto.TareaDto;
import com.gestiontareas.gestiontareas.Entity.TareaEntity;

import java.util.List;

public interface ITareaService {
    List<ResponseTareaDto> getListTareasByUser(FiltroTareaDto filtroTareaDto);

    TareaEntity createTaks(TareaEntity tarea);

    Boolean updateTask(Long id, TareaDto tareaDto);
}
