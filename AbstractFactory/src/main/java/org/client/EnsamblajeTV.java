package org.client;

import org.factory.AbstractFactory;
import org.product.Color;
import org.product.TV;

public class EnsamblajeTV {

    public EnsamblajeTV(AbstractFactory factory) {
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
}
