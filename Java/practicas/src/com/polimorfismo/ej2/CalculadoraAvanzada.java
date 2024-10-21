package com.polimorfismo.ej2;

public class CalculadoraAvanzada {
    
    public int sumar(int a, int b){
        return a + b;
    }

    public double sumar(double a, double b){
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b){
        return a - b;
    }

    public int multiplicar( int a, int b) {
        return a * b;
    }

    public double multiplicar( double a, double b) {
        return a * b;
    }

    public int dividir( int a, int b){
        if (b != 0){
            return a / b;
        }
        throw new ArithmeticException("División por cero");
    }

    public double dividir( double a, double b){
        if (b!= 0.0 || b!=0){
            return a / b;
        }
        throw new ArithmeticException("División por cero");
    }
}
