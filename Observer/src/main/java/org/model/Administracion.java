package org.model;

public class Administracion implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Administración:");
        System.out.println("Envio una queja formal...");
    }
}
