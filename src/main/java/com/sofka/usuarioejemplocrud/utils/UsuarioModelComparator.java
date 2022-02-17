package com.sofka.usuarioejemplocrud.utils;

import java.util.Comparator;

import com.sofka.usuarioejemplocrud.models.UsuarioModel;

//El propósito de esta clase es que si UsuarioModel tiene n atributos, puedan ordenarse por cualquiera de esos.
public class UsuarioModelComparator implements Comparator<UsuarioModel> {
    //Ordenar por nombre
    @Override
    public int compare(UsuarioModel um1, UsuarioModel um2){
        return um1.getNombre().compareTo(um2.getNombre()); 
    }

    public UsuarioModelComparator() {
    }

    
}


