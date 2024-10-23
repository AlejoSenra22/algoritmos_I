package com.excepciones.ej1;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {
        setNombre(nombre);
        setEdad(edad);
        setPromedio(promedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreInvalidoException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) throws PromedioInvalidoException {
        if (promedio < 0.0 || promedio > 10.0) {
            throw new PromedioInvalidoException("El promedio debe estar entre 0.0 y 10.0.");
        }
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Promedio=" + promedio + "]";
    }
}

