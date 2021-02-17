package com.eduit.patrones.template;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(12121);
		System.out.println("El cliente dice: ");
		System.out.println(cliente.identificate());

		Empleado empleado = new Empleado("AD 41252");
		System.out.println("El empleado dice: ");
		System.out.println(empleado.identificate());

		Socio socio = new Socio(46322);
		System.out.println("El empleado dice: ");
		System.out.println(socio.identificate());

	}

}
