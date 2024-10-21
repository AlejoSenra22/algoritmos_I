package com.polimorfismo.ej2;

public class PruebaCalculadoraAvanzada {
    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();

        System.out.println(calc.dividir(67.9, 3.5));
        System.out.println(calc.dividir(5, 3));
        System.out.println(calc.multiplicar(4.8, 7.923781320));
        System.out.println(calc.multiplicar(4, 5));
        System.out.println(calc.restar(5, 15));
        System.out.println(calc.restar(15.5, 0.2));
        System.out.println(calc.sumar(5.67, 9.3246));
        System.out.println(calc.sumar(1, 1));
    }
}
