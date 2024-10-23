package com.excepciones.ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingrese el nombre del estudiante (o 'salir' para terminar): ");
                String nombre = scanner.nextLine();
                if (nombre.equalsIgnoreCase("salir")) break;

                System.out.print("Ingrese la edad del estudiante: ");
                int edad = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el promedio del estudiante: ");
                double promedio = Double.parseDouble(scanner.nextLine());

                registro.agregarEstudiante(nombre, edad, promedio);
                System.out.println("Estudiante registrado exitosamente.");

            } catch (NombreInvalidoException | EdadInvalidaException | PromedioInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
            }

            System.out.println();
        }

        System.out.println("Estudiantes registrados:");
        registro.mostrarEstudiantes();
        scanner.close();
    }
}
