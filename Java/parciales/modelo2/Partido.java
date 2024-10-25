package parciales.modelo2;

import java.time.LocalDate;

public class Partido {
    private LocalDate fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(LocalDate fecha, Equipo local, Equipo visitante, Resultado resultado){
            this.fecha = fecha;
            this.local = local;
            this.visitante = visitante;
            this.resultado = resultado;
    }

    public void asignarPuntos(){
        if (resultado.getgolesLocal() > resultado.getgolesVisita()){
            local.sumarPuntosVictoria();
        }
        else if (resultado.getgolesVisita() > resultado.getgolesLocal()){
            visitante.sumarPuntosVictoria();
        }
        local.sumarPuntoEmpate();
        visitante.sumarPuntoEmpate();
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public Equipo getEquipoLocal() {
        return this.local;
    }

    public Resultado getResultado() {
        return this.resultado;
    }

    public Equipo getEquipoVisitante() {
        return this.visitante;
    }
    
}
