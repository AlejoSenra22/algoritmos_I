package com.abstracts;

public class Arquero extends Personaje implements AtacanteADistancia {
    public Arquero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca al objetivo y quita 4 puntos de vida.");
        objetivo.defender(4); // El Arquero quita 4 puntos de vida al contrincante
    }

    @Override
    public void defender(int danio) {
        puntosVida -= danio;
        System.out.println(nombre + " se defiende y recibe " + danio + " puntos de daño.");
    }

    // Implementar ataque a distancia
    @Override
    public void atacarDistancia(Personaje objetivo) {
        System.out.println(nombre + " realiza un ataque a distancia que evade la defensa.");
        objetivo.puntosVida -= 5; // Ataque a distancia sin considerar la defensa
        System.out.println(objetivo.nombre + " ahora tiene " + objetivo.puntosVida + " puntos de vida.");
    }
}
