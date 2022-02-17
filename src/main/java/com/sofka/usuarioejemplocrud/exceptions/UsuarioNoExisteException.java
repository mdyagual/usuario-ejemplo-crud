package com.sofka.usuarioejemplocrud.exceptions;

/*Mejora para la eliminación de los usuarios: Crear una excepción propia*/
public class UsuarioNoExisteException extends Exception{

    public UsuarioNoExisteException(String message) {
        super(message);
    }
    
}
