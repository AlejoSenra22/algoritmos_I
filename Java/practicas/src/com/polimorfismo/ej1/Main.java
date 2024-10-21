package com.polimorfismo.ej1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medio> medios = new ArrayList<>();

        Medio granGatsby = new Libro("F. Scott Fitzgerald", "El Gran Gatsby");
        Medio laLaLand = new Pelicula("Damien Chazelle", "La La Land");
        Medio bohemianhapsody = new Musica("Queen", "Bohemian Rhapsody");

        medios.add(bohemianhapsody);
        medios.add(laLaLand);
        medios.add(granGatsby);

        for (Medio medio : medios) {
            medio.reproducir();
        }
    }
}
