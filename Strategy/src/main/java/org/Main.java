package org;

import org.model.Alumno;
import org.model.Colegio;
import org.strategy.CompetenciaNacional;
import org.strategy.ListadoStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        List<Alumno> alumnos = colegio.getAlumnos();

        ListadoStrategy st = new CompetenciaNacional();

        //Se puede evitar que el cliente conozca los strategy concretos
        List<Alumno> rta = st.getListado(alumnos);

        System.out.println("Los participantes son:");
        rta.forEach(a -> System.out.println(a.getNombre()));
    }
}
