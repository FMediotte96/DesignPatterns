package com.api.java.model;

import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println(o);
        System.out.print("Compras: ");
        System.out.println("Solicito nueva cotización...");
    }
}
