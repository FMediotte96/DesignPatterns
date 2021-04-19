package org;

import org.factory.TrianguloFactory;
import org.model.Triangulo;

public class Main {

    public static void main(String[] args) {
        TrianguloFactory factory = TrianguloFactory.getInstance();

        Triangulo triangulo = factory.createTriangulo(10, 10, 10);
        System.out.println(triangulo.getDescription());
    }
}
