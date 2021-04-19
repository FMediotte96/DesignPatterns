package org.factory;

import org.product.Azul;
import org.product.Color;
import org.product.LCD;
import org.product.TV;

public class FactoryLcdAzul extends AbstractFactory {
    @Override
    public TV createTV() {
        return new LCD();
    }

    @Override
    public Color createColor() {
        return new Azul();
    }
}
