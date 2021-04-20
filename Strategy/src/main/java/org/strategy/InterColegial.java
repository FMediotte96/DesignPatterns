package org.strategy;

import org.model.Alumno;

import java.util.List;

public class InterColegial implements ListadoStrategy {
    @Override
    public List<Alumno> getListado(List<Alumno> lista) {
        return lista.subList(0, 5);
    }
}
