package com.gestiontareas.gestiontareas.Repository;

import com.gestiontareas.gestiontareas.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

    UsuarioEntity findUsuarioEntityByIdentidad(String identidad);
}
