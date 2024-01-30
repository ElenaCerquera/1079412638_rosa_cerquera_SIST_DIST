package com.gestiontareas.gestiontareas.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "recordatorio")
public class RecordatorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fechaHora;
    private String tipo; // Puedes tener un enum para los tipos de recordatorio (correo, notificación, etc.)
    private String contenido;
    // Otros atributos y getters/setters

    /*
    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private TareaEntity tarea;

     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /*
    public TareaEntity getTarea() {
        return tarea;
    }

    public void setTarea(TareaEntity tarea) {
        this.tarea = tarea;
    }

     */
}
