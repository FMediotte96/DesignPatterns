package org;

import org.model.Administracion;
import org.model.Compras;
import org.model.Stock;
import org.observer.AlarmaLibro;
import org.observer.Biblioteca;
import org.observer.Libro;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarmas = new AlarmaLibro();
        alarmas.attach(new Compras());
        alarmas.attach(new Administracion());
        alarmas.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setAlarma(alarmas);
        biblioteca.devuelveLibro(libro);
    }
}
