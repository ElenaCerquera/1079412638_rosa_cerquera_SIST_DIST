package com.gestiontareas.gestiontareas.Service;

import com.gestiontareas.gestiontareas.Dto.*;
import com.gestiontareas.gestiontareas.Entity.MateriaEntity;
import com.gestiontareas.gestiontareas.Entity.TareaEntity;
import com.gestiontareas.gestiontareas.Entity.UsuarioEntity;
import com.gestiontareas.gestiontareas.IService.ITareaService;
import com.gestiontareas.gestiontareas.Repository.MateriaRepository;
import com.gestiontareas.gestiontareas.Repository.TareaRepository;
import com.gestiontareas.gestiontareas.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements ITareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Autowired
    private MateriaRepository materiaRepository;
    @Autowired
    private UsuarioRepository usuRepo;

    @Override
    public List<ResponseTareaDto> getListTareasByUser(FiltroTareaDto filtroTareaDto) {


        Optional<MateriaEntity> materiaEntity = materiaRepository.findByNombreMateriaAndUsuarioId(filtroTareaDto.getNombreMateria() ,filtroTareaDto.getUsuarioId());

        if (materiaEntity.isPresent()){
            List<ResponseTareaDto> responseTareaDto = obtenerResponseTareaDto(materiaEntity.get());
            return responseTareaDto;
        }
        return null;
    }



    @Override
    public TareaEntity createTaks(TareaEntity tarea) {
        TareaEntity crearTarea = new TareaEntity();
        crearTarea.setNombre(tarea.getNombre());
        crearTarea.setFechaInicio(LocalDate.now());
        crearTarea.setFechaFin(LocalDate.now().plusDays(10));
        crearTarea.setUsuario(tarea.getUsuario());
        return tareaRepository.save(crearTarea);
    }

    @Override
    public Boolean updateTask(Long id, TareaDto tareaDto) {
        Optional<TareaEntity> optionalTarea = tareaRepository.findById(id);
        if (optionalTarea.isPresent()){
            TareaEntity tarea = optionalTarea.get();
            tarea.setEstadoTarea(tareaDto.getEstado());
            tareaRepository.save(tarea);
            return true;
        }
        return false;
    }

    public List<ResponseTareaDto> obtenerResponseTareaDto(MateriaEntity materiaEntity) {
        List<ResponseTareaDto> listaResponse = new ArrayList<>();
        for (TareaEntity tarea : materiaEntity.getTarea()) {
            ResponseTareaDto responseTareaDto = new ResponseTareaDto();
            responseTareaDto.setId(tarea.getId());
            responseTareaDto.setNombre(tarea.getNombre());
            responseTareaDto.setDescripcion(tarea.getDescripcion());
            responseTareaDto.setFechaInicio(tarea.getFechaInicio());
            responseTareaDto.setFechaFin(tarea.getFechaFin());
            responseTareaDto.setEstadoTarea(tarea.getEstadoTarea());
            listaResponse.add(responseTareaDto);
        }
        return listaResponse;
    }

    public List<ListaTareaDto> obtener (String identidad, String materia ) {

        if (materia.isEmpty()) {
           return tareaRepository.obt(identidad);
        }else{
            return tareaRepository.obtenerconmateria(identidad, materia);
        }


    }

    public void adicionar (AdicionarTareaDTO adicionarTareaDTO)
    {
        Long id = usuRepo.obtenerId(adicionarTareaDTO.getIdentidad());

        TareaEntity tare = new TareaEntity();
        UsuarioEntity usu = new UsuarioEntity();
        usu.setId(id);

        tare.setNombre(adicionarTareaDTO.getNombre());
        tare.setDescripcion(adicionarTareaDTO.getDescripcion());
        tare.setFechaInicio(adicionarTareaDTO.getFechaInicio());
        tare.setFechaFin(adicionarTareaDTO.getFechaFin());
        tare.setEstadoTarea(adicionarTareaDTO.getEstadoTarea());
        tare.setUsuario(usu);

        tareaRepository.save(tare);
    }

}
