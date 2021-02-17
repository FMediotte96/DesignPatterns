package com.eduit.patrones.template;

public class Socio extends Persona {

	private Integer nroSocio;

	public Socio() {
	}

	public Socio(Integer nroSocio) {
		super();
		this.nroSocio = nroSocio;
	}

	@Override
	protected String getTipoId() {
		return "numero de socio";
	}

	@Override
	protected String getIdentificacion() {
		return String.valueOf(nroSocio);
	}

	public Integer getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(Integer nroSocio) {
		this.nroSocio = nroSocio;
	}

}
