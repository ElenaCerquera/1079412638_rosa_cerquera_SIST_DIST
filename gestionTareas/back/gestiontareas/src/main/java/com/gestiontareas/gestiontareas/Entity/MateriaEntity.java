package com.gestiontareas.gestiontareas.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "materia")
public class MateriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombreMateria;

    @OneToMany
    private List<UsuarioEntity> usuario;
    @OneToMany
    private List<TareaEntity> tarea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<TareaEntity> getTarea() {
        return tarea;
    }

    public void setTarea(List<TareaEntity> tarea) {
        this.tarea = tarea;
    }

    public List<UsuarioEntity> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<UsuarioEntity> usuario) {
        this.usuario = usuario;
    }
}
