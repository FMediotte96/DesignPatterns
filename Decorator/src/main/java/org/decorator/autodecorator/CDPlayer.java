package org.decorator.autodecorator;

import org.decorator.model.Vendible;

public class CDPlayer extends AutoDecorator {

    public CDPlayer(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescription() {
        return getVendible().getDescription() + " + CD Player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1000;
    }
}
