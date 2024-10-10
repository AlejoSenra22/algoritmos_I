package com.introduccion;

public class Estudiante {
    String Nombre;
    int Edad;
    String Carrera;
    String[] Materias;

    public Estudiante(String Nombre, int Edad, String Carrera, String[] Materias) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Carrera = Carrera;
        this.Materias = Materias;

    }

    public void imprimirDetalles(){
        System.out.println("Estudiante: " + this.Nombre);
        System.out.println("Edad: " + this.Edad);
        System.out.println("Carrera: " + this.Carrera);
        System.out.println("Listado de Materias: ");
        for (String i : this.Materias){
            System.out.println(i);
        };
        
    }
    public static void main(String[] args) {

        String[] Materias = {"Algoritmos I", "Matemática Discreta", "Análisis I", "Análisis II", "ICD", "IAA", "Probabilidad y Estadística", "Programación I", "Infraestructura para CD", "SQL"};

        Estudiante Alejo = new Estudiante("Alejo", 21, "Ciencia de Datos", Materias);

        Alejo.imprimirDetalles();
    }
}
