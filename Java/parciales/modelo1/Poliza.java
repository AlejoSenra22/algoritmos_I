package parciales.modelo1;

import java.time.LocalDate;
import java.util.Objects;

public class Poliza {
    protected Cliente cliente;
    protected double monto;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public Poliza(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin){
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || getClass() != otro.getClass()) {
            return false;
        }

        Poliza otraPoliza = (Poliza) otro;

        return Objects.equals(cliente, otraPoliza.cliente) && 
               Objects.equals(fechaInicio, otraPoliza.fechaInicio) && 
               Objects.equals(fechaFin, otraPoliza.fechaFin) &&
               monto == otraPoliza.monto;
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(cliente, monto, fechaInicio, fechaFin);
    }

    protected void setClienteNuevo(Cliente c) {
        this.cliente = c;
    }
}
