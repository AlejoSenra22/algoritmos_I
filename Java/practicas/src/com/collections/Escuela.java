package com.collections;

import java.util.*;

public class Escuela {
    private List<Estudiante> estudiantes = new ArrayList<>();
    private Set<Materia> materias = new HashSet<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void registrarCalificacion(int matricula, Materia materia, double calificacion) {
        if (!materias.contains(materia)) {
            System.out.println("La materia no existe en la escuela.");
            return;
        }

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getMatricula() == matricula) {
                estudiante.getHistoriaAcademica().agregarCalificacion(materia, calificacion);
                System.out.println("Calificación registrada.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            for (Map.Entry<Materia, Set<Double>> entrada : estudiante.getHistoriaAcademica().getCalificacionesPorMateria().entrySet()) {
                Materia materia = entrada.getKey();
                Set<Double> calificaciones = entrada.getValue();
                System.out.println("Materia: " + materia);
                System.out.println("Calificaciones: " + calificaciones);
                System.out.println("Promedio: " + estudiante.getHistoriaAcademica().calcularPromedio(materia));
                System.out.println("Aplazos: " + estudiante.getHistoriaAcademica().contarAplazos(materia));
            }
            System.out.println("Total materias cursadas: " + estudiante.getHistoriaAcademica().contarMateriasCursadas());
            System.out.println();
        }
    }
}

