package org.decorator.autodecorator;

import org.decorator.autodecorator.AutoDecorator;
import org.decorator.model.Vendible;

public class AireAcondicionado extends AutoDecorator {

    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescription() {
        return getVendible().getDescription() + " + Aire Acondicionado";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 15000;
    }
}
