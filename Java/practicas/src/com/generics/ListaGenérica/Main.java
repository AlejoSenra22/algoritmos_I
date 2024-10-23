package com.generics.ListaGenérica;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ListaGenérica con elementos de tipo String
        ListaGenerica<String> lista = new ListaGenerica<>(String.class, 2);

        // Agregar elementos a la lista
        lista.add(0, "Hola");
        lista.add(1, "Mundo");
        lista.add(2, "Java");

        // Mostrar la lista después de agregar elementos
        System.out.println("Lista después de agregar elementos: " + lista);

        // Reemplazar el segundo elemento ("Mundo" -> "Lenguaje")
        lista.set(1, "Lenguaje");
        System.out.println("Lista después de set(1, 'Lenguaje'): " + lista);

        // Eliminar el tercer elemento ("Java")
        lista.remove(2);
        System.out.println("Lista después de remove(2): " + lista);

        // Verificar el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.size());

        // Probar con otra lista de tipo Integer
        ListaGenerica<Integer> listaNumeros = new ListaGenerica<>(Integer.class, 3);
        listaNumeros.add(0, 10);
        listaNumeros.add(1, 20);
        listaNumeros.add(2, 30);
        System.out.println("Lista de números: " + listaNumeros);

        listaNumeros.remove(1);
        System.out.println("Lista de números después de remove(1): " + listaNumeros);
    }
}

