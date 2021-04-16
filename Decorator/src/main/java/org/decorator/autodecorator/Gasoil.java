package org.decorator.autodecorator;

import org.decorator.model.Vendible;

public class Gasoil extends AutoDecorator {

    public Gasoil(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescription() {
        return getVendible().getDescription() + " + Gasoil";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 12000;
    }
}
