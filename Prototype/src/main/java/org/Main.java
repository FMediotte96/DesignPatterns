package org;

import org.model.TV;
import org.prototype.TvPrototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");

        System.out.println(tv.getPrecio());
    }
}
