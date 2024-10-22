package com.abstracts;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }
    
    public abstract void atacar(Personaje objetivo);
    public abstract void defender(int daño);
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de vida: " + puntosVida);
        }
}
    

