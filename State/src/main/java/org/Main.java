package org;

import org.model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan");
        System.out.println(p.comoTeSentis());

        p.dolorDeCabeza();
        System.out.println(p.comoTeSentis());
    }
}
