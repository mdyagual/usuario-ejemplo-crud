package com.sofka.usuarioejemplocrud.controllers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.services.UsuarioService;
import com.sofka.usuarioejemplocrud.utils.UsuarioModelComparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*Para mejorar
1. Establecer rutas individuales para cada tag independiente del tipo, para un mejor manejo
2. Creación de queries más específicos para busqueda de información (buscar usuarios inicial nombre)
3. Comparator para ordenar la consulta general de usuarios por nombre o correo
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
        return uService.getUsuarios();
    }

    @GetMapping("/nombres")
    //http://127.0.0.1:8081/usuario/ordennombre
    public ArrayList<UsuarioModel> obtenerUsuariosNombre(){
        ArrayList<UsuarioModel> uSinOrden = uService.getUsuarios();
        Collections.sort(uSinOrden,new UsuarioModelComparator());
        return uSinOrden;
    }

    @PostMapping("/registrar")
    //http://127.0.0.1:8081/usuario  
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel u){
        return this.uService.saveUsuario(u);
    }

    @GetMapping(path = "/{id}")
    //http://127.0.0.1:8081/usuario/id
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.uService.getById(id);
    }
    
    @GetMapping("/query")
    //http://127.0.0.1:8081/usuario/query?prioridad=5
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.uService.getByPrioridad(prioridad);
    }

    @GetMapping("/query")
    //http://127.0.0.1:8081/usuario/query?inicial=M
    public ArrayList<UsuarioModel> obtenerUsuariosPorInicial(@RequestParam("inicial") char c){
        return this.uService.getByInitial(c);
    }

    @DeleteMapping(path= "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.uService.deleteUsuario(id);
        if(ok){
            return "Usuario eliminado";
        }else{
            return "No se pudo eliminar el usuario con id: "+id;
        }
    }



}
