package com.gestiontareas.gestiontareas.Service;

import com.gestiontareas.gestiontareas.Entity.MateriaEntity;
import com.gestiontareas.gestiontareas.Repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MateriaService {
    @Autowired
    private MateriaRepository repository;

    public void creartarea (MateriaEntity materia){

        repository.save(materia);
    }

    public List<MateriaEntity> listatarea (){
        return repository.findAll();
    }
}
