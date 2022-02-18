package com.sofka.usuarioejemplocrud.exceptions;

public class CorreoInvalidoException extends Exception{

    public CorreoInvalidoException(String message) {
        super("Correo inválido, recuerde el formato: nombre_(numero)@mail.com");
    }
    
}
