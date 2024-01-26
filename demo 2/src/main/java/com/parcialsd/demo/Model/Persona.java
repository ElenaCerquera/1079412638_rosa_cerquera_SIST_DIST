package com.parcialsd.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TipoDocumento")
    private String tipoDocumento;

    @Column(name = "NombrePersona")
    private String nombrePersona;

    @Column(name = "EstadoCredito")
    private String estadoCredito;

    @Column(name = "ValorCredito")
    private Float valorCredito;

    public Persona(Long id, String tipoDocumento, String nombrePersona, String estadoCredito, Float valorCredito) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.nombrePersona = nombrePersona;
        this.estadoCredito = estadoCredito;
        this.valorCredito = valorCredito;
    }

    public Persona() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getEstadoCredito() {
        return estadoCredito;
    }

    public void setEstadoCredito(String estadoCredito) {
        this.estadoCredito = estadoCredito;
    }

    public Float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Float valorCredito) {
        this.valorCredito = valorCredito;
    }
}
