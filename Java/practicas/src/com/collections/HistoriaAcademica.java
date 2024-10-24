package com.collections;
import java.util.*;

public class HistoriaAcademica {
    private Map<Materia, Set<Double>> calificacionesPorMateria = new HashMap<>();

    public void agregarCalificacion(Materia materia, Double calificacion) {
        if (!calificacionesPorMateria.containsKey(materia)) {
            calificacionesPorMateria.put(materia, new HashSet<>());
        }
        calificacionesPorMateria.get(materia).add(calificacion);
    }

    public double calcularPromedio(Materia materia) {
        Set<Double> calificaciones = calificacionesPorMateria.get(materia);
        if (calificaciones == null || calificaciones.isEmpty()) return 0.0;

        double suma = 0.0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    public int contarAplazos(Materia materia) {
        Set<Double> calificaciones = calificacionesPorMateria.get(materia);
        if (calificaciones == null) return 0;

        int aplazos = 0;
        for (Double calificacion : calificaciones) {
            if (calificacion < 2.0) aplazos++;
        }
        return aplazos;
    }

    public int contarMateriasCursadas() {
        return calificacionesPorMateria.size();
    }

    public Map<Materia, Set<Double>> getCalificacionesPorMateria() {
        return calificacionesPorMateria;
    }
}

