package com.eduit.patrones.template;

public abstract class Persona {

	private String nombre;
	private String dni;

	public String identificate() {
		String frase = "Me identifico con: ";
		frase += getTipoId();
		frase += ". El numero es: ";
		frase += getIdentificacion();
		return frase;
	}

	protected abstract String getTipoId();

	protected abstract String getIdentificacion();

	public Persona() {
	}

	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
