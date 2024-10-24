package parciales.modelo1;

import java.time.LocalDate;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



public class Aseguradora {
    private List<Cliente> clientes;
    private List<Poliza> polizas;

    public Poliza asegurarVehiculo(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, Vehiculo vehiculo) {
        
        Poliza nuevaPoliza =  new PolizaAutomotor(cliente, fechaInicio, fechaFin, vehiculo);

        return nuevaPoliza;
    }

    public Poliza asegurarVida(Cliente cliente, double monto, LocalDate fechaInicio, LocalDate fechaFin) {

        Poliza nuevaPoliza = new PolizaVida(cliente, monto, fechaInicio, fechaFin);

        return nuevaPoliza;
        
    }

	public void mostrarPolizas() {
        this.ordenarPolizas();
		for (Poliza p : polizas){
            //Aca van los prints que pide el ejercicio
        }
	}

    public void transferirPoliza(Poliza p, Cliente c) {
        Poliza polizaObjetivo = this.getPoliza(p);
        polizaObjetivo.setClienteNuevo(c);
    }

    public void ordenarPolizas() {
        Collections.sort(polizas, new Comparator<Poliza>() {
            @Override
            public int compare(Poliza p1, Poliza p2) {
                return p1.getFechaInicio().compareTo(p2.getFechaInicio());
            }
        });
    }

    public Poliza getPoliza(Poliza poliza){
        for (Poliza p : polizas){
            if (p.equals(poliza)){
                return p;
            }
            continue;

        }
        throw new PolizaNoEncontradaException("La poliza indica no se encontró en el sistema");
    }



}
