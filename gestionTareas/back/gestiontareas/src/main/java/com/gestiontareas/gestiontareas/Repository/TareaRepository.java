package com.gestiontareas.gestiontareas.Repository;

import com.gestiontareas.gestiontareas.Entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity,Long> {

    List<TareaEntity> findAllByUsuarioId(Long usuarioId);
}
