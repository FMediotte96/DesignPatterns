package org.model;

public class Isosceles extends Triangulo {

    public Isosceles(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescription() {
        return "Soy un triangulo Isosceles";
    }

    @Override
    public double getSuperficie() {
        //Algoritmo para calcular superficie
        return 0;
    }

    @Override
    public void dibujate() {
        //Algoritmo para dibujarse
    }
}
