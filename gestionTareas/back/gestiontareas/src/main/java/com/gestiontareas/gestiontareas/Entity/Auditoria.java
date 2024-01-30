package com.gestiontareas.gestiontareas.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Auditoria {

    @Column(name = "state")
    private Boolean state;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "update_at")
    private LocalDateTime update_at;

    @Column(name = "delete_at")
    private LocalDateTime delete_at;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public LocalDateTime getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(LocalDateTime delete_at) {
        this.delete_at = delete_at;
    }
}
