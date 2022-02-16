package com.sofka.usuarioejemplocrud.controllers;


import java.util.ArrayList;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;
import com.sofka.usuarioejemplocrud.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    //Injección para usar aquí los métodos del servicio que se instancia
    @Autowired
    UsuarioService uService;

    @GetMapping    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return uService.getUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel u){
        return this.uService.saveUsuario(u);
    }



}
