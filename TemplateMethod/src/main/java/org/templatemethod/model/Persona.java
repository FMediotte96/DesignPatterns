package org.templatemethod.model;

public abstract class Persona {

    private String nombre;
    private String dni;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /*
        Define el esqueleto del algoritmo y luego las subclases deben implementar los métodos:
        getIdentification() y getTipoId()
     */
    public String identificate() {
        String frase = "Me identifico con: ";
        frase += getTipoId();
        frase += ". El número es: ";
        frase += getIdentificacion();
        return frase;
    }

    protected abstract String getIdentificacion();

    protected abstract String getTipoId();
}
