package parciales.modelo1;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class PolizaVida extends Poliza {
    private double costoAnual;

    public PolizaVida(Cliente cliente, double monto, LocalDate fechaInicio, LocalDate fechaFin){
        super(cliente, fechaInicio, fechaFin);
        this.monto = monto;
    }

    public void setMonto(){
        Scanner ingresoMonto = new Scanner(System.in);
        System.out.println("Ingrese monto para el seguro de vida: ");
        this.monto = ingresoMonto.nextDouble();
    }

    public void setCostoAnual(){
        if (this.cliente.getEdad(this.getFechaInicio()) < 35){
            this.costoAnual = this.monto * 0.05;
        }
        this.costoAnual = this.monto * 0.10;
    }
    
        @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || getClass() != otro.getClass()) {
            return false;
        }

        PolizaVida otraPoliza = (PolizaVida) otro;

        return Objects.equals(cliente, otraPoliza.cliente) && 
               Objects.equals(fechaInicio, otraPoliza.fechaInicio) && 
               Objects.equals(fechaFin, otraPoliza.fechaFin) &&
               monto == otraPoliza.monto &&
               costoAnual == otraPoliza.costoAnual;
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(cliente, monto, fechaInicio, fechaFin, costoAnual);
    }

   
    
}
