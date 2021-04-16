package org.decorator.main;

import org.decorator.autodecorator.CDPlayer;
import org.decorator.autodecorator.Gasoil;
import org.decorator.autodecorator.Mp3Player;
import org.decorator.autodecorator.AireAcondicionado;
import org.decorator.model.FiatUno;
import org.decorator.model.FordFiesta;
import org.decorator.model.Vendible;

public class Main {

    public static void main(String[] args) {
        Vendible auto = new FiatUno();
        auto = new CDPlayer(auto);
        auto = new Gasoil(auto);

        System.out.println(auto.getDescription());
        System.out.println("Su precio es: " + auto.getPrecio());

        Vendible auto2 = new FordFiesta();
        auto2 = new Mp3Player(auto2);
        auto2 = new Gasoil(auto2);
        auto2 = new AireAcondicionado(auto2);

        System.out.println(auto2.getDescription());
        System.out.println("Su precio es: " + auto2.getPrecio());
    }
}
