package com.collections;

import java.util.Objects;

public class Materia {
    private String nombre;
    private int codigo;
    private boolean estado;

    public Materia(String nombre, int codigo, boolean estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Materia materia = (Materia) obj;
        return codigo == materia.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre='" + nombre + '\'' + ", codigo=" + codigo + ", estado=" + (estado ? "abierta" : "cerrada") + '}';
    }
}

