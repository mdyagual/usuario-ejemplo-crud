package com.sofka.usuarioejemplocrud.repositories;

import java.util.ArrayList;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

    //Otros métodos patrocinados por CrudRepository
    //public abstract ArrayList<UsuarioModel> findByNombre(String nombre);
    //public abstract ArrayList<UsuarioModel> findByEmail(String email);
}
