package com.introduccion;

import java.time.LocalDate;
import java.util.Date;

public class Libro {
    private String titulo;
    private String autor;
    private int  añoPublicacion;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = LocalDate.now().getYear();
    }
    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
    public static void main(String[] args) {
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R Tolkien");

        Libro libro2 = new Libro("Harry Potter y el cáliz de fuego", "J.K Rowling", 2000);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
    }

}