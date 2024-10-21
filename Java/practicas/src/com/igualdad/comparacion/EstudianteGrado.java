package com.igualdad.comparacion;

public class EstudianteGrado extends Estudiante {
    private String carreraGrado;

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado){
        super(nombre, edad);
        this.matricula = matricula;
        this.carreraGrado = carreraGrado;
    }
    
    @Override
    public boolean equals(Object otro){
        if (this == otro){
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()){
            return false;
        }

        EstudianteGrado otro2 = (EstudianteGrado) otro;
        return this.matricula == otro2.matricula && this.carreraGrado == otro2.carreraGrado;
    }
}
