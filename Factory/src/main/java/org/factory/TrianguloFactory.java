package org.factory;

import org.model.Equilatero;
import org.model.Escaleno;
import org.model.Isosceles;
import org.model.Triangulo;

public class TrianguloFactory {

    //Singleton
    private static TrianguloFactory instance;

    private TrianguloFactory() {
    }

    public synchronized static TrianguloFactory getInstance() {
        if (instance == null) {
            instance = new TrianguloFactory();
        }
        return instance;
    }

    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            return new Equilatero(ladoA, ladoB, ladoC);
        } else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
            return new Escaleno(ladoA, ladoB, ladoC);
        } else {
            return new Isosceles(ladoA, ladoB, ladoC);
        }
    }
}
