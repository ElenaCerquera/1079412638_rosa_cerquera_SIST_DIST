package com.gestiontareas.gestiontareas.Repository;

import com.gestiontareas.gestiontareas.Entity.MateriaEntity;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaEntity,Long> {


    Optional<MateriaEntity> findByNombreMateriaAndUsuarioId(String nombreMateria, Long usuarioId);



    /*
    @Query(value = "SELECT m FROM MateriaEntity m JOIN m.usuario u WHERE m.nombreMateria = :nombreMateria AND u.identidad = :identidad",nativeQuery = true)
    Optional<MateriaEntity> findByNombreMateriaAndUsuarioIdentidad(@Param("nombreMateria") String nombreMateria, @Param("identidad") String identidad);

    @Query(value = "SELECT m.* FROM materia m JOIN materia_usuario mu ON m.id = mu.materia_entity_id JOIN usuario u ON u.id = mu.usuario_id WHERE m.nombre = 'mate' AND u.identidad = '111'",nativeQuery = true)
    Optional<MateriaEntity> findByNombreMateriaAndUsuarioIdentidad2(@Param("nombreMateria") String nombreMateria, @Param("identidad") String identidad);

    @Query(value = "SELECT * FROM materia m JOIN materia_usuario mu ON m.id = mu.materia_entity_id JOIN usuario u ON u.id = mu.usuario_id WHERE m.nombre = 'mate' AND u.identidad = '111'",nativeQuery = true)
    Optional<MateriaEntity> findByNombreMateriaAndUsuarioIdentidad3(@Param("nombreMateria") String nombreMateria, @Param("identidad") String identidad);

     */


}
