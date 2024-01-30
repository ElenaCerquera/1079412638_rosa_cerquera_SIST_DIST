package com.gestiontareas.gestiontareas.Repository;

import com.gestiontareas.gestiontareas.Dto.ListaTareaDto;
import com.gestiontareas.gestiontareas.Entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity,Long> {

    List<TareaEntity> findAllByUsuarioId(Long usuarioId);


    @Query (value = "select u.nombre AS nombreusuario, t.id AS id, " +
            "t.nombre AS nombre, t.descripcion AS descripcion," +
            " t.fecha_inicio AS fechaInicio, t.fecha_fin AS fechaFin, t.estado AS estadoTarea from parcial.usuario u \n" +
            "Left JOIN parcial.tarea t ON u.id = t.usuario_id\n" +
            "WHERE u.identidad=:identidad \n",nativeQuery = true)
    List<ListaTareaDto> obt (@Param("identidad") String identidad);

    @Query (value = "select u.nombre AS nombreusuario, t.id AS id, " +
            "t.nombre AS nombre, t.descripcion AS descripcion," +
            " t.fecha_inicio AS fechaInicio, t.fecha_fin AS fechaFin, t.estado AS estadoTarea from parcial.usuario u \n" +
            "Left JOIN parcial.tarea t ON u.id = t.usuario_id\n" +
            "WHERE u.identidad=:identidad AND t.nombre=:materia \n",nativeQuery = true)
    List<ListaTareaDto> obtenerconmateria (@Param("identidad") String identidad,
                                           @Param("materia") String materia
                                           );

}
