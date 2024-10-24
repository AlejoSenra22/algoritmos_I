package com.collections;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int matricula;
    private int edad;
    private HistoriaAcademica historiaAcademica;

    public Estudiante(String nombre, int matricula, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.historiaAcademica = new HistoriaAcademica();
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public HistoriaAcademica getHistoriaAcademica() {
        return historiaAcademica;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        return matricula == that.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre='" + nombre + '\'' + ", matricula=" + matricula + ", edad=" + edad + '}';
    }
}

