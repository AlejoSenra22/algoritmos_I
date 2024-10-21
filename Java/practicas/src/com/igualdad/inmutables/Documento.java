package com.igualdad.inmutables;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public final class Documento {
    private final int numero;
    private final LocalDate fechaEmision;
    private final LocalDate fechaVencimiento;

    public Documento(int numero){
        this.numero = numero;
        this.fechaEmision = LocalDate.now();
        this.fechaVencimiento = (this.fechaEmision.plusYears(10));
    }

    public Documento Renovar(int numero){
        Documento renovado = new Documento(numero);
        return renovado;
    }

    public void getData(){
        System.out.println("Numero de Documento: " + this.numero);
        System.out.println("Emisión: " + this.fechaEmision);
        System.out.println("Vence en la fecha: " + this.fechaVencimiento );
    }

    public Documento copiaSup(){
        Documento copia = new Documento(this.numero);
        return copia;
    }
}
