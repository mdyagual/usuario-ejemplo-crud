package com.sofka.usuarioejemplocrud.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintViolationException;

import com.sofka.usuarioejemplocrud.exceptions.CorreoInvalidoException;
import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*Para mejorar
1. Establecer rutas individuales para cada tag independiente del tipo, para un mejor manejo
2. Creación de queries más específicos para busqueda de información (buscar usuarios inicial nombre)
3. Mejoras en el método delete con excepciones
4. Creación de método put para actualización
*/

//Regla personal: En el controlador los métodos van en español
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    //Injección para usar aquí los métodos del servicio que se instancia
    @Autowired
    UsuarioService uService;

    @GetMapping("/all")
    //http://127.0.0.1:8081/usuario/all    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return this.uService.getUsuarios();
    }

    @GetMapping("/allByNombres")
    //http://127.0.0.1:8081/usuario/allByNombres
    public ArrayList<UsuarioModel> obtenerUsuariosNombre(){
        return this.uService.getUsuariosNombre();
    }

    @PostMapping("/registrar")
    //http://127.0.0.1:8081/usuario  
    public String guardarUsuario(@RequestBody UsuarioModel u){
        try {
            this.uService.saveUsuario(u);
            return u.toString();
        } catch (ConstraintViolationException e) {
            return e.toString();
            
            
        }
        
    }

    @PutMapping(path = "/actualizar")
    //http://127.0.0.1:8081/usuario/actualizar  
    public String actualizarUsuario(@RequestBody UsuarioModel u){
        boolean ok = this.uService.updateUsuario(u);
        if(ok){
            return "Usuario actualizado";
        }else{
           
            return "No se pudo actualizar";
        }
        

    }

    @GetMapping(path = "/{id}")
    //http://127.0.0.1:8081/usuario/id
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.uService.getById(id);
    }
    
    @GetMapping("/queryPrioridad")
    //http://127.0.0.1:8081/usuario/queryPrioridad?prioridad=5
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.uService.getByPrioridad(prioridad);
    }

    @GetMapping("/queryInicial")
    //http://127.0.0.1:8081/usuario/queryInicial?inicial=M
    public List<UsuarioModel> obtenerUsuariosPorInicial(@RequestParam("inicial") char c){
        return this.uService.getByInitial(c);
    }

    @DeleteMapping(path= "/eliminar/{id}")
    //http://127.0.0.1:8081/usuario/eliminar/id
    public String eliminarPorId(@PathVariable("id") Long id){
        
        boolean ok = this.uService.deleteUsuario(id);
        if(ok){
            return "Usuario eliminado";
        }else{
           
            return "No se pudo eliminar";
        }
    }



}
