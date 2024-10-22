package com.abstracts;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Paladín y Wizard
        Paladin paladin = new Paladin("Sir Arthur", 10, 100);
        Wizard wizard = new Wizard("Gandalf", 12, 80);

        // Mostrar el estado inicial de los personajes
        System.out.println("Estado inicial:");
        paladin.mostrarEstado();
        wizard.mostrarEstado();
        System.out.println();

        // El Paladín ataca al Wizard
        System.out.println("Acción 1: Paladín ataca al Wizard");
        paladin.atacar(wizard);
        wizard.mostrarEstado(); // Mostrar el estado del Wizard después del ataque
        System.out.println();

        // El Wizard ataca al Paladín
        System.out.println("Acción 2: Wizard ataca al Paladín");
        wizard.atacar(paladin);
        paladin.mostrarEstado(); // Mostrar el estado del Paladín después del ataque
        System.out.println();

        // El Paladín se defiende
        System.out.println("Acción 3: Paladín se defiende");
        paladin.defender(8); // Simulación de un ataque que genera 8 puntos de daño
        paladin.mostrarEstado(); // Mostrar el estado del Paladín después de defender
        System.out.println();

        // El Wizard se defiende
        System.out.println("Acción 4: Wizard se defiende");
        wizard.defender(10); // Simulación de un ataque que genera 10 puntos de daño
        wizard.mostrarEstado(); // Mostrar el estado del Wizard después de defender
        
        Arquero arquero = new Arquero("Robin Hood", 8, 90);

        // Arreglo de personajes que pueden atacar a distancia
        AtacanteADistancia[] atacantesADistancia = { wizard, arquero };

        // Mostrar el estado inicial de los personajes
        System.out.println("Estado inicial:");
        paladin.mostrarEstado();
        wizard.mostrarEstado();
        arquero.mostrarEstado();
        System.out.println();

        // Realizar ataques a distancia sobre el Paladín
        for (AtacanteADistancia atacante : atacantesADistancia) {
            atacante.atacarDistancia(paladin);
            paladin.mostrarEstado(); // Mostrar el estado del Paladín después del ataque
            System.out.println();}
        
    }
}
