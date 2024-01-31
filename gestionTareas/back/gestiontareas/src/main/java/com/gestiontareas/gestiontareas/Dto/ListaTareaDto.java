package com.gestiontareas.gestiontareas.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public interface ListaTareaDto {
    String getNombreusuario();
    Long getId();
    String getNombre();
    String getDescripcion();
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate getFechaInicio();
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate getFechaFin();
    String getEstadoTarea();
    String getProfesor();
}

