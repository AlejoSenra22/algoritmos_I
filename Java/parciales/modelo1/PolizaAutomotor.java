package parciales.modelo1;

import java.time.LocalDate;
import java.util.Objects;


public class PolizaAutomotor extends Poliza {
    private Vehiculo vehiculo;
    private double costoAnual;
    
    public PolizaAutomotor(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, Vehiculo vehiculo){
        super(cliente, fechaInicio, fechaFin);
        this.vehiculo = vehiculo;
    }

    public void setMonto(){
        int antiguedad = vehiculo.getAntiguedad();
        double porcentaje = 0.05 * antiguedad;
        this.monto = vehiculo.getPrecioCompra() - (vehiculo.getPrecioCompra() * 0.05);
    }
    
    public void setCostoAnual(){
        if (this.cliente.getEdad(fechaInicio) < 30) {
            this.costoAnual = this.monto * 0.20;
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

        PolizaAutomotor otraPoliza = (PolizaAutomotor) otro;

        return Objects.equals(cliente, otraPoliza.cliente) && 
               Objects.equals(fechaInicio, otraPoliza.fechaInicio) && 
               Objects.equals(fechaFin, otraPoliza.fechaFin) &&
               monto == otraPoliza.monto &&
               vehiculo == otraPoliza.vehiculo &&
               costoAnual == costoAnual;
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(cliente, monto, fechaInicio, fechaFin);
    }
}
