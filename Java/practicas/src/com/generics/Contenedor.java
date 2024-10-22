package com.generics;

public class Contenedor<T> {
    public T valor;

    public Contenedor(){
        this.valor = null;
    }

    public void agregar(T valor){
        this.valor = valor;
    }

    public void quitar(){
        this.valor = null;
    }

    public Boolean esVacio(){
        if (this.valor == null){
            return true;
        }
        return false;
    }

    public String toString(T val){
        return " " + val + "";

    }

    public void mostrar(){
        String val = toString(this.valor);
        System.out.println("Este contenedor almacena: " + val);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        
        Contenedor<?> otro = (Contenedor<?>) obj;
        if (this.valor == null) {
            return otro.valor == null;
        }
        return this.valor.equals(otro.valor);
    }

    @Override
public int hashCode() {
    int result = 17; 
    result = 31 * result + (valor != null ? valor.hashCode() : 0);
    return result;
}

    
}
