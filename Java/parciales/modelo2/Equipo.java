package parciales.modelo2;

public class Equipo {
    private String nombre;
    private int cantidadHinchas;
    private int puntos = 0;

    public Equipo(String nombre, int cantidadHinchas){
        this.nombre = nombre;
        this.cantidadHinchas = cantidadHinchas;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidadHinchas(){
        return cantidadHinchas;
    }

    public void sumarPuntosVictoria() {
        this.puntos += 3;
    }

    public void sumarPuntoEmpate() {
        this.puntos++;
    }

    public Integer getPuntos() {
        return this.puntos;
    }

    public int partidosJugados(Torneo torneo) {
        int partidos = 0;
        for (Partido p : torneo.getPartidos()){
            if (p.getEquipoLocal().equals(this) || p.getEquipoVisitante().equals(this)){
                partidos++;
            }
        }
        return partidos;
    }

    @Override
    public boolean equals(Object eq){
        if (this == eq){
            return true;
        }

        if (eq == null || eq.getClass() != this.getClass()){
            return false;
        }

        Equipo otroEquipo = (Equipo) eq;
        return otroEquipo.getNombre() == this.getNombre() && otroEquipo.getCantidadHinchas() == this.getCantidadHinchas();
    }

    public int partidosGanados(Torneo torneo) {
        int pg = 0;
        for (Partido p : torneo.getPartidos()){
            if (p.getEquipoLocal().equals(this)){
                if (p.getResultado().getgolesLocal() > p.getResultado().getgolesVisita()){
                    pg++;
                }
            }
            else if (p.getEquipoVisitante().equals(this)){
                if (p.getResultado().getgolesVisita() > p.getResultado().getgolesLocal()){
                    pg++;    
                }
            }
        }
        return pg;
    }

    public int partidosPerdidos(Torneo torneo) {
        int pj = this.partidosJugados(torneo);
        int pg = this.partidosGanados(torneo);
        if (pj == pg){
            return 0;
        }
        // ....
    }

    public String golesFavor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'golesFavor'");
    }

    public String golesContra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'golesContra'");
    }

    public String diferenciaGol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diferenciaGol'");
    }
    
}
