package parciales.modelo2;

public class Resultado {
    private int golesLocal;
    private int golesVisita;

    public Resultado(int golesLocal, int golesVisita){
        this.golesLocal = golesLocal;
        this.golesVisita = golesVisita;
    }

    public int getgolesLocal(){
        return golesLocal;
    };

    public int getgolesVisita(){
        return golesVisita;
    }

}
