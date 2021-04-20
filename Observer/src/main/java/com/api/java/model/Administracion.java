package com.api.java.model;

import java.util.Observable;
import java.util.Observer;

public class Administracion implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println(o);
        System.out.print("Administración: ");
        System.out.println("Envio una queja formal...");
    }
}
