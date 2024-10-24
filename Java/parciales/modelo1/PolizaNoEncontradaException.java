package parciales.modelo1;

public class PolizaNoEncontradaException extends RuntimeException{
    public String mensaje;

    public PolizaNoEncontradaException(String mensaje){
        this.mensaje = mensaje;
    }
};
