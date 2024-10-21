package com.igualdad.inmutables;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<persona> gente = new ArrayList<>();
        
        Documento docAS = new Documento(066);
        Documento docOK = new Documento(501);
        Documento docY = new Documento(001);
        Documento docLS = new Documento(010);
        Documento docRX = new Documento(511);
        persona anakin = new persona("Anakin", "Skywalker", docAS);
        persona obiwan = new persona("Obi-Wan", "Kenobi", docOK);
        persona yoda = new persona("Maestro", "Yoda", docY);
        persona luke = new persona("Luke", "Skywalker", docLS);
        persona rex = new persona("Capitán", "Rex", docRX);

        gente.add(anakin);
        gente.add(obiwan);
        gente.add(yoda);
        gente.add(luke);
        gente.add(rex);

        for (persona p : gente) {
            p.mostrar();
        }
        
        //rex.documento.Renovar(rex.documento.numero); 
        //No se puede acceder a los métodos porque están ocultos
        //anakin.documento.Renovar(anakin.documento.numero);
        //Ocurre lo mismo.

        // En conclusion, no se puede renovar los documentos porque las clases son inmutables y no podemos acceder a los atributos.
    }
}
