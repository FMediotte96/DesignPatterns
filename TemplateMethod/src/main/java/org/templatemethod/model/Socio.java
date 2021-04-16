package org.templatemethod.model;

public class Socio extends Persona {

    private int numeroDeSocio;

    public Socio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    @Override
    protected String getIdentificacion() {
        return String.valueOf(numeroDeSocio);
    }

    @Override
    protected String getTipoId() {
        return "número de socio";
    }

    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }
}
