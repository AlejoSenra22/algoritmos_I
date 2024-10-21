package com.polimorfismo.ej1;

public class Libro extends Medio {
    private String autor;
    private String titulo;

    public Libro(String autor,String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Libro: "+ titulo + " de " + autor);
    }
    
}
