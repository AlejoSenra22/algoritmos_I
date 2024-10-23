package com.excepciones.ej1;

class NombreInvalidoException extends Exception {
    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}