package com.gestiontareas.gestiontareas.Service;

import com.gestiontareas.gestiontareas.Dto.LoginDto;
import com.gestiontareas.gestiontareas.Entity.UsuarioEntity;
import com.gestiontareas.gestiontareas.IService.IUsuarioService;
import com.gestiontareas.gestiontareas.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Boolean login(LoginDto loginDto) {
        UsuarioEntity usuarioEntity = usuarioRepository
                .findUsuarioEntityByIdentidad(loginDto.getIdentidad());

        if (usuarioEntity.getContrasena().equals(loginDto.getContrasena())) {
            return true;
        }
        return false;
    }

    @Override
    public UsuarioEntity saveUser(UsuarioEntity usuarioEntity) {
        LocalDateTime fechaHoraActualConMicrosegundos = LocalDateTime.now();

        // Truncar a milisegundos
        LocalDateTime fechaHoraActual = fechaHoraActualConMicrosegundos
                .withNano((fechaHoraActualConMicrosegundos.getNano() / 1_000_000) * 1_000_000);

        // Formatear la fecha y hora actual en el formato "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fechaHoraActual.format(formatter);

        // Obtener el día, el mes y la hora por separado
        int diaActual = fechaHoraActual.getDayOfMonth();
        int mesActual = fechaHoraActual.getMonthValue();
        int horaActual = fechaHoraActual.getHour();

        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNombre(usuarioEntity.getNombre());
        usuario.setIdentidad(usuarioEntity.getIdentidad());
        usuario.setContrasena(usuarioEntity.getContrasena());
        usuario.setCreated_at(fechaHoraActualConMicrosegundos);
        usuario.setState(true);
        usuario.setUpdate_at(null);
        usuario.setDelete_at(null);
        return usuarioRepository.save(usuario);
    }

}
