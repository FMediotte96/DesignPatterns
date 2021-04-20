package org.strategy;

import org.model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class CompetenciaInternacional implements ListadoStrategy {
    @Override
    public List<Alumno> getListado(List<Alumno> lista) {
        List<Alumno> resultado = new ArrayList<>();
        resultado.add(lista.get(0));
        return resultado;
    }
}
