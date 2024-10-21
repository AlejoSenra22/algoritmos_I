package com.polimorfismo.ej1;

public class Pelicula extends Medio {
    private String director;
    private String titulo;

    public Pelicula(String director,String titulo){
        this.director = director;
        this.titulo = titulo;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Película: "+ titulo + " de " + director);
    }
    
}