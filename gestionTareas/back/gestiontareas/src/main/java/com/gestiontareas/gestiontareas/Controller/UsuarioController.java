package com.gestiontareas.gestiontareas.Controller;

import com.gestiontareas.gestiontareas.Dto.LoginDto;
import com.gestiontareas.gestiontareas.Entity.UsuarioEntity;
import com.gestiontareas.gestiontareas.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping("/login")
    public Boolean login(@RequestBody LoginDto loginDto){
        return iUsuarioService.login(loginDto);
    }

    @PostMapping("/save")
    public void getUserById(@RequestBody UsuarioEntity usuario){
         iUsuarioService.saveUser(usuario);
    }


}
