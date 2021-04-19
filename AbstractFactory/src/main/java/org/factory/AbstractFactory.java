package org.factory;

import org.product.Color;
import org.product.TV;

public abstract class AbstractFactory {
    public abstract TV createTV();

    public abstract Color createColor();
}
