package com.eduit.patrones.singleton;

public class Banco {

	private static Banco instance;

	private String nombre;
	private String calle;
	private int numero;
	private String telefono;

	private Banco() {
		this.nombre = "Banco IT";
		this.calle = "Lavalle";
		this.numero = 648;
		this.telefono = "1234-5678";
	}

	public static Banco getInstance() {
		if (instance == null) {
			instance = new Banco();
		}
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Banco{nombre="+nombre+", calle=" + calle + 
				", numero=" + numero + ", telefono=" + telefono + "}";
	}
}
