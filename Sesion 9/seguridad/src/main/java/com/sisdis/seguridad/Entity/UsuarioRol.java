package com.sisdis.seguridad.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "usuario", nullable = false)
    private Long usuarioId;

    @Column(name = "rol", nullable = false)
    private Long rolId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario", nullable = false, unique = true, insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol", nullable = false, unique = true, insertable = false, updatable = false)
    private Rol rol;

}
