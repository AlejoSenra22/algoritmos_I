package com.collections;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
    
        Materia matematica = new Materia("Matemática", 101, true);
        Materia literatura = new Materia("Literatura", 102, true);
        Materia fisica = new Materia("Física", 103, false);

        escuela.agregarMateria(matematica);
        escuela.agregarMateria(literatura);
        escuela.agregarMateria(fisica);

        Estudiante estudiante1 = new Estudiante("Juan", 1, 20);
        Estudiante estudiante2 = new Estudiante("Ana", 2, 22);

        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);

        // Ingresar calificaciones
        escuela.registrarCalificacion(1, matematica, 8.5);
        escuela.registrarCalificacion(1, literatura, 6.0);
        escuela.registrarCalificacion(2, fisica, 7.0);

        // Mostrar datos de los estudiantes
        escuela.mostrarEstudiantes();
    }
}

