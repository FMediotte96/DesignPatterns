package org.strategy;

import org.model.Alumno;

import java.util.List;

public interface ListadoStrategy {
    List<Alumno> getListado(List<Alumno> lista);
}
