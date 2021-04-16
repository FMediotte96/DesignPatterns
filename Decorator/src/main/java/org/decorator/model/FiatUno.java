package org.decorator.model;

public class FiatUno extends Auto {

    @Override
    public String getDescription() {
        return "Fiat Uno modelo 2006";
    }

    @Override
    public int getPrecio() {
        return 150000;
    }
}
