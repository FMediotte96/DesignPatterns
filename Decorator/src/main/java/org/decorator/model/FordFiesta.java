package org.decorator.model;

public class FordFiesta extends Auto {

    @Override
    public String getDescription() {
        return "Ford Fiesta modelo 2008";
    }

    @Override
    public int getPrecio() {
        return 250000;
    }
}
