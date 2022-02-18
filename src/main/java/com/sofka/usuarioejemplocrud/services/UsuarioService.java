package com.sofka.usuarioejemplocrud.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sofka.usuarioejemplocrud.exceptions.CorreoInvalidoException;
import com.sofka.usuarioejemplocrud.exceptions.UsuarioNoExisteException;
import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.repositories.UsuarioRepository;
import com.sofka.usuarioejemplocrud.utils.UsuarioModelComparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Regla personal: En el servicio los métodos van en Inglés
/*Para mejorar
1. Creación de método para buscar usuarios por una inicial
2. Creación de método para que devuelva los usuarios ordenados por el nombre
3. Creación de método para que actualice un usuario existente
*/
@Service
public class UsuarioService {
    //Injección para usar aquí los métodos de la interfaz a la que se instancia
    @Autowired
    UsuarioRepository uRepository;

    //Obtener todos los usuarios
    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) uRepository.findAll();
    }
    //Obtener todos los usuarios ordenados por el nombre
    public ArrayList<UsuarioModel> getUsuariosNombre(){
        ArrayList<UsuarioModel> uSinOrden = getUsuarios();
        Collections.sort(uSinOrden,new UsuarioModelComparator());
        return uSinOrden;
    }


    //Guardar usuarios
    public UsuarioModel saveUsuario(UsuarioModel u) throws CorreoInvalidoException{
        return uRepository.save(u);        
         
    }

    //Actualizar usuarios
    public boolean updateUsuario(UsuarioModel u){   
        Optional<UsuarioModel> op_u = getById(u.getId());  
        try{                       
            if(op_u.isPresent()){                
                uRepository.save(u);
                return true;
            }else{
                throw new UsuarioNoExisteException("Usuario con id: "+u.getId()+" no existe");
            }
            
        }catch(UsuarioNoExisteException e){   
            System.out.println(e);         
            return false;
        }
        
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
    public List<UsuarioModel> getByInitial(char c){        
        List<UsuarioModel> usuarios = getUsuarios();
        List<UsuarioModel> uInicial= usuarios.stream()
                                             .filter(l -> l.getNombre().charAt(0) == c)
                                             .collect(Collectors.toList());
        return uInicial;
    }
    
    //Eliminar usuario por id: Agregación de excepción personalizada y mejora para una eliminación adecuada
    public boolean deleteUsuario(Long id){    
        try{
            Optional<UsuarioModel> op_u = getById(id);             
            if(op_u.isPresent()){
                uRepository.deleteById(id);
                return true;

            }else{
                throw new UsuarioNoExisteException("Usuario con id: "+id+" no existe");
            }
            
        }catch(UsuarioNoExisteException e){   
            System.out.println(e);         
            return false;
        }
    }



    
}
