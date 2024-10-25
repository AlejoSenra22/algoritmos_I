package parciales.modelo3;

import java.time.LocalDate;

public class Donacion {
    private Donante donante;
    private LocalDate fecha;
    private double monto;
    private Estado estado;
    private int id;

    public enum Estado {
        Pendiente,
        Rechazada,
        Cobrada
    }
    
    public Donacion(Donante donante, LocalDate fecha, double monto){
        this.donante = donante;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = Estado.Pendiente;
    }

    public Donante getDonante(){
        return this.donante;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public double getMonto(){
        return this.monto;
    }

    public Estado getEstado(){
        return this.estado;
    }

    public void setID(ONG ong) {
        this.id = ong.getdonacionesTotal();
    }

    public int getID(){
        return this.id;
    }

    public void setCobrada() {
        this.estado = Estado.Cobrada;
    }

    public void setRechazada() {
       this.estado = Estado.Rechazada;
    }


}
