package org.builder;

import org.model.Motor;

public class FordBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(21212);
        motor.setPotencia("20 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Focus");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Ford");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(4);
    }
}
