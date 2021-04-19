package org.model;

import org.state.DolorDeCabeza;
import org.state.DolorDePanza;
import org.state.SaludState;
import org.state.Saludable;

public class Persona {
    private String nombre;
    private SaludState salud;

    public Persona() {
        salud = new Saludable();
    }

    public void estoyBien() {
        salud = new Saludable();
    }

    public void dolorDeCabeza() {
        salud = new DolorDeCabeza();
    }

    public void dolorDePanza() {
        salud = new DolorDePanza();
    }

    public String comoTeSentis() {
        return salud.comoTeSentis();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SaludState getSalud() {
        return salud;
    }

    public void setSalud(SaludState salud) {
        this.salud = salud;
    }
}
