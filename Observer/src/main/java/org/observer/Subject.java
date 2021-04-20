package org.observer;

import org.model.ILibroMalEstado;

public interface Subject {
    void attach(ILibroMalEstado observador);

    void dettach(ILibroMalEstado observador);

    void notifyObservers();
}
