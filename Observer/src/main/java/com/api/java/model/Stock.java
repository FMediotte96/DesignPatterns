package com.api.java.model;

import java.util.Observable;
import java.util.Observer;

public class Stock implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println(o);
        System.out.print("Stock: ");
        System.out.println("Le doy de baja...");
    }
}
