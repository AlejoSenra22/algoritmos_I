package com.abstracts;

public class Paladin extends Personaje {
    public Paladin(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca al objetivo y quita 5 puntos de vida.");
        objetivo.defender(5); // El Paladín quita 5 puntos de vida al contrincante
    }

    @Override
    public void defender(int daño) {
        int dañoReducido = daño - 2; // El Paladín reduce el daño en 2 puntos
        if (dañoReducido < 0) dañoReducido = 0;
        puntosVida -= dañoReducido;
        System.out.println(nombre + " se defiende y reduce el daño recibido a " + dañoReducido + " puntos.");
    }
}

