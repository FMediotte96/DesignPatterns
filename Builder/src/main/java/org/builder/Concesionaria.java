package org.builder;

import org.builder.AutoBuilder;
import org.model.Auto;

public class Concesionaria {
    private AutoBuilder autoBuilder;

    public void construirAuto() {
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }

    public Auto getAuto() {
        return autoBuilder.getAuto();
    }
}
