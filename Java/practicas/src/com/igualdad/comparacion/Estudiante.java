package com.igualdad.comparacion;

public class Estudiante {
    protected String nombre;
    protected int edad;
    protected int matricula;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object otro){
        if (this == otro) {
            return true;
        }

        if (!(otro instanceof Estudiante)) {
            return false;
        }

        Estudiante otro2 = (Estudiante) otro;
        return this.matricula == otro2.matricula;
    }

    
}
