package com.polimorfismo.ej1;

public class Musica extends Medio {
    private String artista;
    private String titulo;

    public Musica(String artista,String titulo){
        this.artista = artista;
        this.titulo = titulo;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Musica: "+ titulo + " de " + artista);
    }
    
}