package parciales.modelo1;

public class Vehiculo {
    private String domino;
    private int añoFabricacion;
    private double precioCompra;

    public Vehiculo(String domino, double precioCompra, int añoFabricacion) {
        this.domino = domino;
        this.precioCompra = precioCompra;
        this.añoFabricacion = añoFabricacion;
    }

    public String getDomino(){
        return this.domino;
    }

    public int getAñoFabricacion(){
        return this.añoFabricacion;
    }

    public double getPrecioCompra(){
        return this.precioCompra;
    }

    public int getAntiguedad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAntiguedad'");
    }

}
