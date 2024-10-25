package parciales.modelo2;

public class EquipoNoEncontradoException extends RuntimeException {
    private String mensaje;

    public EquipoNoEncontradoException(String mensaje){
        this.mensaje = mensaje;
    }

}
