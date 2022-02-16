package com.sofka.usuarioejemplocrud.services;
import java.util.ArrayList;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.repositories.UsuarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    //Injección para usar aquí los métodos de la interfaz a la que se instancia
    @Autowired
    UsuarioRepository uRepository;

    //Obtener todos los usuarios
    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) uRepository.findAll();
    }

    //Guardar usuarios
    //Preguntar: Esto de aquí no tiene que ser un void?
    public UsuarioModel saveUsuario(UsuarioModel u){
        return uRepository.save(u);
    }



    
}
