package org.factory;

import org.product.Amarillo;
import org.product.Color;
import org.product.Plasma;
import org.product.TV;

public class FactoryPlasmaAmarillo extends AbstractFactory {
    @Override
    public TV createTV() {
        return new Plasma();
    }

    @Override
    public Color createColor() {
        return new Amarillo();
    }
}
