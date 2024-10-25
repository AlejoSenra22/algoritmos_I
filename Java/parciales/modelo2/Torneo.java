package parciales.modelo2;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Torneo {
    private List<Equipo> equipos;
    private List<Partido> partidos;
    //private HashMap<Equipo, List<?>> tabla;

    public Torneo(){};

    public void cargarEquipo(String nombre, int cantidadHinchas){
        Equipo equipo = new Equipo(nombre, cantidadHinchas);
        this.equipos.add(equipo);
    }

    public void cargarPartido(String local, String visitante, LocalDate fecha, int golesLocal, int golesVisita){
        Equipo local_type = this.getEquipo(local);
        Equipo visitante_type = this.getEquipo(visitante);

        Resultado resultado = new Resultado(golesLocal, golesVisita);
        Partido partido = new Partido(fecha, local_type, visitante_type, resultado);

        this.partidos.add(partido);
    }

    public Equipo getEquipo(String objetivo){
        for (Equipo e : equipos){
            if (e.getNombre() == objetivo){
                return e;
            }
        }
        throw new EquipoNoEncontradoException("El equipo no se encuentra cargado en el torneo");
    }

    public List<Equipo> getEquipos(){
        return equipos;
    }

    public List<Partido> getPartidos(){
        return partidos;
    }

    public void mostrarPartidosFecha(LocalDate dia){
        for (Partido partido : partidos){
            if (partido.getFecha() == dia){
                System.out.println("Fecha: "+ dia + "," + partido.getEquipoLocal().getNombre() + "(" + partido.getResultado().getgolesLocal() + ")" + " - " + partido.getEquipoVisitante().getNombre() + " (" + partido.getResultado().getgolesVisita() + ")" );
            }
        }
        

    }

    //public void crearTabla(){
    //    for (Equipo e : equipos){
    //        this.tabla.put(e, e.getPuntos());
    //    } 
    //}

    public void mostrarTabla(){
        System.out.println("Equipo | Ju | Pu | Ga | Em | Pe | GF | GC | DG");
        Collections.sort(this.equipos, (e1, e2) -> Integer.compare(e2.getPuntos(), e1.getPuntos())); 
        for (Equipo e : equipos){
            System.out.println(e.getNombre()+ " | " + e.partidosJugados(this) + " | " + e.partidosGanados() + " | " + e.partidosGanados() + " | " + e.partidosPerdidos() + " | " + e.golesFavor() + " | " + e.golesContra() + " | " + e.diferenciaGol());
        }
    

    }


    
}
