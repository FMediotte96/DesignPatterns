package com.api.java;

import com.api.java.model.Administracion;
import com.api.java.model.Compras;
import com.api.java.model.Stock;
import com.api.java.observer.AlarmaLibro;
import com.api.java.observer.Biblioteca;
import com.api.java.observer.Libro;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarmas = new AlarmaLibro();
        alarmas.addObserver(new Compras());
        alarmas.addObserver(new Administracion());
        alarmas.addObserver(new Stock());

        Libro libro = new Libro();
        libro.setTitulo("Windows es estable");
        libro.setEstado("MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setAlarma(alarmas);
        biblioteca.devuelveLibro(libro);
    }
}
