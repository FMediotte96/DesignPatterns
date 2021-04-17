package org.chain.main;

import org.chain.model.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitudPrestamo(150000);
    }
}
