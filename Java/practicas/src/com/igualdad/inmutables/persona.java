package com.igualdad.inmutables;

public final class persona {
    private final String nombre;
    private final String apellido;
    private final Documento documento;

    public persona(String nombre, String apellido, Documento documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ this.nombre + this.apellido);
        this.documento.getData();
    }

    public persona copiaSup(){
        persona copia = new persona(this.nombre, this.apellido, this.documento);
        return copia;
    }
}
