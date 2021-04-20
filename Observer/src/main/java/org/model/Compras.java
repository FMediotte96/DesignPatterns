package org.model;

public class Compras implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Compras");
        System.out.println("Solicito nueva cotización...");
    }
}
