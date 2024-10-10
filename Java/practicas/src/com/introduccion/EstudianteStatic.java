package com.introduccion;

public class EstudianteStatic {
    private static int estudiantesTotales;
    private String nombre;
    private int edad;

    public EstudianteStatic(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        agregarEstudiante(); 
    }
    
    public void presentarse(){
        System.out.println("Hola, mi nombre es " + this.nombre + " Y tengo " + this.edad + " años");
    }

    public static int getEstudiantesTotales(){
        return estudiantesTotales;
    }

    public static void agregarEstudiante(){
        estudiantesTotales = estudiantesTotales + 1;
    }
}
