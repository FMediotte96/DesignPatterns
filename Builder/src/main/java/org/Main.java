package org;

import org.builder.Concesionaria;
import org.builder.FordBuilder;
import org.model.Auto;

public class Main {

    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.setAutoBuilder(new FordBuilder());
        concesionaria.construirAuto();

        Auto auto = concesionaria.getAuto();
        System.out.println(auto.getMarca());
    }
}
