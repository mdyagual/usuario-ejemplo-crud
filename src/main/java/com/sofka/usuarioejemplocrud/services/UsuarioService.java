package com.sofka.usuarioejemplocrud.services;
import java.util.ArrayList;
import java.util.Optional;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.repositories.UsuarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Regla personal: En el servicio los métodos van en Inglés
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
    public UsuarioModel saveUsuario(UsuarioModel u){
        return uRepository.save(u);
    }

    //Obtener usuario por id
    public Optional<UsuarioModel> getById(Long id){
        return uRepository.findById(id);
    }

    //Obtener usuario(s) por prioridad
    public ArrayList<UsuarioModel> getByPrioridad(Integer prioridad){
        return uRepository.findByPrioridad(prioridad);
    }

    //Obtener usuario(s) por inicial
    public ArrayList<UsuarioModel> getByInitial(char c){
        return uRepository.findByInicialNombre(c);
    }

    //Eliminar usuario por id
    public boolean deleteUsuario(Long id){
        try{
            uRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }



    
}
