package parciales.modelo3;

import java.util.HashMap;
import java.util.Objects;

public class Donante {
    protected String nombre;
    protected String apellido;
    public HashMap<ONG, Integer> idsONGs = new HashMap<ONG, Integer>();

    public Donante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object d) {
        if (this == d) {
            return true;
        }
        if (d == null || d.getClass() != this.getClass()) {
            return false;
        }
        Donante otroD = (Donante) d;
            return this.getNombre().equals(otroD.getNombre()) && this.getApellido().equals(otroD.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }


    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarIdONG(ONG ong, Integer id){
        this.idsONGs.put(ong, id);

    }

    public int getId(ONG ong) {
        return this.idsONGs.get(ong);
    }
}
