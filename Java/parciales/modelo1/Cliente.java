package parciales.modelo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getEdad(LocalDate fechaLimite) {
        long edad = ChronoUnit.YEARS.between(this.fechaNacimiento, fechaLimite);
        return edad;
    }



}
