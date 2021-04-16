package org.templatemethod.main;

import org.templatemethod.model.Cliente;
import org.templatemethod.model.Empleado;
import org.templatemethod.model.Persona;
import org.templatemethod.model.Socio;

public class Main {

    public static void main(String[] args) {
        Persona p = new Cliente(12121);
        System.out.println("El cliente dice: ");
        System.out.println(p.identificate());

        p = new Empleado("AD 41252");
        System.out.println("El empleado dice: ");
        System.out.println(p.identificate());

        p = new Socio(46232);
        System.out.println("El socio dice: ");
        System.out.println(p.identificate());
    }
}
