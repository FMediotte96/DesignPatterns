package org.observer;

import org.model.ILibroMalEstado;

import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro implements Subject {
    private List<ILibroMalEstado> observadores = new ArrayList<>();

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
        observadores.forEach(ILibroMalEstado::update);
    }
}
