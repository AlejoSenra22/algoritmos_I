package com.igualdad.comparacion;

public class EstudiantePosgrado extends Estudiante {
    private String carreraPosGrado;
    
    public EstudiantePosgrado(String nombre, int edad, int matricula, String carreraPosGrado){
        super(nombre, edad);
        this.matricula = matricula;
        this.carreraPosGrado = carreraPosGrado;
    }

    public boolean equals(Object otro){
        if (this == otro){
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()){
            return false;
        }

        EstudiantePosgrado otro2 = (EstudiantePosgrado) otro;
        return this.matricula == otro2.matricula && this.carreraPosGrado == otro2.carreraPosGrado;
    }
}
