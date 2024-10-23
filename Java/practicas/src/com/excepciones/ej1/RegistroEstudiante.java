package com.excepciones.ej1;

import java.util.ArrayList;
import java.util.List;


class RegistroEstudiantes {
    private List<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int edad, double promedio) throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {
        Estudiante estudiante = new Estudiante(nombre, edad, promedio);
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
}
