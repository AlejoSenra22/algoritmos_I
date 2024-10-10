package com.introduccion;

public class Rectangulo {
    double largo;
    double ancho;

    public Rectangulo(){
        this.largo = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void calcularArea(){
        double area = this.largo * this.ancho;
        System.out.println("Area del rectángulo: " + area);

    }

    public void calcularPerimetro() {
        double perimetro = (2 * this.largo) + (2 * this.ancho);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3.2, 4.6);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
     }

}
