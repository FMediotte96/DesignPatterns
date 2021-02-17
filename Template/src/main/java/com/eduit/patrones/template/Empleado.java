package com.eduit.patrones.template;

public class Empleado extends Persona {

	private String legajo;

	public Empleado() {
	}

	public Empleado(String legajo) {
		this.legajo = legajo;
	}

	@Override
	protected String getTipoId() {
		return "numero de legajo";
	}

	@Override
	protected String getIdentificacion() {
		return legajo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

}
