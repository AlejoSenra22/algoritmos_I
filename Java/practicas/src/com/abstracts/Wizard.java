package com.abstracts;

public class Wizard extends Personaje implements AtacanteADistancia {
    public Wizard(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca al objetivo y quita 3 puntos de vida.");
        objetivo.defender(3); // El Wizard quita 3 puntos de vida al contrincante
    }

    @Override
    public void defender(int danio) {
        int danioReducido = danio - 3; // El Wizard reduce el daño en 3 puntos
        if (danioReducido < 0) danioReducido = 0;
        puntosVida -= danioReducido;
        System.out.println(nombre + " se defiende y reduce el daño recibido a " + danioReducido + " puntos.");
    }

    @Override
    public void atacarDistancia(Personaje objetivo) {
        System.out.println(nombre + " realiza un ataque a distancia que evade la defensa.");
        objetivo.puntosVida -= 4; // Ataque a distancia sin considerar la defensa
        System.out.println(objetivo.nombre + " ahora tiene " + objetivo.puntosVida + " puntos de vida.");
    }
}
