package com.gestiontareas.gestiontareas.IService;

import com.gestiontareas.gestiontareas.Dto.LoginDto;
import com.gestiontareas.gestiontareas.Entity.UsuarioEntity;

public interface IUsuarioService {

    Boolean login(LoginDto loginDto);

    void saveUser(UsuarioEntity usuarioEntity);

}
