package org.decorator.autodecorator;

import org.decorator.model.Vendible;

public abstract class AutoDecorator implements Vendible {
    private Vendible vendible;

    public AutoDecorator(Vendible vendible) {
        this.vendible = vendible;
    }

    public Vendible getVendible() {
        return vendible;
    }

    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
}
