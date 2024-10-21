package com.herencia;


class Figura {
    
    public void calcularArea(){

    }
}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        double area = (this.radio * this.radio * Math.PI); 
        System.out.println("Area del circulo: " + area);  
    }
    
}

//Aunque técnicamente podría importar la clase de otro lado, la voy a volver a definir por fines prácticos
class Rectangulo extends Figura{
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea(){
        double area = this.largo * this.ancho;
        System.out.println("Area del rectángulo: " + area);
    }

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4.3);
        Rectangulo rectangulo = new Rectangulo(3.87, 7.80);

        circulo.calcularArea();
        rectangulo.calcularArea();
    }

}

