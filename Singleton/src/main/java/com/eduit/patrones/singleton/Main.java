package com.eduit.patrones.singleton;

public class Main {
	
	public static void main(String[] args) {
		Banco banco1= Banco.getInstance();
		System.out.println(banco1.toString());
		
		Banco banco2= Banco.getInstance();
		banco2.setCalle("Rivadavia");
		System.out.println(banco2);
		
		Banco banco3= Banco.getInstance();
		System.out.println(banco3);
	}

}
