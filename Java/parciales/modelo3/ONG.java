package parciales.modelo3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ONG {
    private String razonSocial;
    private List<Donante> donantes = new ArrayList<Donante>();
    private List<Donacion> donaciones = new ArrayList<Donacion>();
    public static int donantesTotal = 0;
    public static int donacionesTotal = 0;

    public ONG(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial(){
        return this.razonSocial;
    }

    public int getdonacionesTotal(){
        return donacionesTotal;
    }

    public Donante registrarDonante(String nombre, String apellido) {
        Donante nuevoDonante = new Donante(nombre, apellido);
        this.donantes.add(nuevoDonante);
        donantesTotal++;
        nuevoDonante.agregarIdONG(this, donantesTotal);
        return nuevoDonante;        
    }

    public Donacion cargarDonacion(Donante donante, LocalDate fecha, int monto) {
        Donacion nuevaDonacion = new Donacion(donante, fecha, monto);
        this.donaciones.add(nuevaDonacion);
        donacionesTotal++;
        nuevaDonacion.setID(this);
        return nuevaDonacion;
        
    }

    public void mostrarDonantes() {
        System.out.println("Listado de donantes de " + this.razonSocial);
        for (Donante d : donantes){
            System.out.println("("+ d.getId(this) +") " + d.getNombre() + ", " + d.getApellido());
        }
    }

    public void mostrarDonaciones(){
        System.out.println("Listado de donaciones de "+ this.razonSocial);
        Collections.sort(this.donaciones, (d1, d2) -> d1.getFecha().compareTo(d2.getFecha()));
        for (Donacion d : donaciones){
            System.out.println("Donacion " + d.getID());
            System.out.println("- Donante: (" + d.getDonante().getId(this) + ") " + d.getDonante().getNombre() + ", " + d.getDonante().getApellido());
            System.out.println("- Fecha: " + d.getFecha());
            System.out.println("- Estado: " + d.getEstado());
            System.out.println("- Monto: " + d.getMonto());
        }

    }

    public void mostrarResultadoAFuturaFecha(LocalDate fechaLimite) {
        int cobradas = 0;
        int rechazadas = 0;
        int pendientes = 0;
        double totalCobradas = 0;
        double maxCobrada = Double.MIN_VALUE;
        double minCobrada = Double.MAX_VALUE;

        // Recorremos las donaciones que cumplen la fecha límite
        for (Donacion donacion : donaciones) {
            if (donacion.getFecha().isAfter(fechaLimite)) {
                continue;
            }

            switch (donacion.getEstado()) {
                case Cobrada:
                    cobradas++;
                    double monto = donacion.getMonto();
                    totalCobradas += monto;
                    if (monto > maxCobrada) maxCobrada = monto;
                    if (monto < minCobrada) minCobrada = monto;
                    break;
                case Rechazada:
                    rechazadas++;
                    break;
                case Pendiente:
                    pendientes++;
                    break;
            }
        }

        // Mostrar resultados en consola
        System.out.println("Cantidad de donaciones cobradas: " + cobradas);
        System.out.println("Cantidad de donaciones rechazadas: " + rechazadas);
        System.out.println("Cantidad de donaciones pendientes: " + pendientes);

        if (cobradas > 0) {
            System.out.println("Monto total acumulado de donaciones cobradas: " + totalCobradas);
            System.out.println("Monto de donación cobrada máximo: " + maxCobrada);
            System.out.println("Monto de donación cobrada mínimo: " + minCobrada);
            System.out.println("Monto medio de las donaciones cobradas: " + (totalCobradas / cobradas));
        }
    }
}


    
    

