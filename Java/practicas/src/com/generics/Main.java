package com.generics;

public class Main { //TODO: ver errores de comparación en equals.
    public static void main(String[] args) {
        
        Contenedor<String> contenedorString = new Contenedor<>();
        contenedorString.agregar("Hola");
        contenedorString.mostrar();

        
        System.out.println("Comparando con 'Hola': " + contenedorString.equals("Hola"));
        System.out.println("Comparando con 'Adiós': " + contenedorString.equals("Adiós"));

        
        Contenedor<Integer> contenedorInteger = new Contenedor<>();
        contenedorInteger.agregar(42);
        contenedorInteger.mostrar();

        
        System.out.println("Comparando con 42: " + contenedorInteger.equals(42));
        System.out.println("Comparando con 100: " + contenedorInteger.equals(100));
    }
}

