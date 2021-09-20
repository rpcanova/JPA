package com.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="Terrestre" )
public class Terrestre extends Veiculo{
	
	private int qtdePortas;
	private boolean possuiArCondicionado;
	private boolean possuiVidrosEletricos;
	private String tipoCambio;
	private boolean possuiTetoSolar;
	
	public Terrestre() {
		super();
	}

	public Terrestre(int idVeiculo, String modelo, int potencia, int anoFabricacao, String fabricante,
			int capacidadePassageiros, int qtdePortas, boolean possuiArCondicionado, boolean possuiVidrosEletricos, String tipoCambio, boolean possuiTetoSolar) {
		super(idVeiculo, modelo, potencia, anoFabricacao, fabricante, capacidadePassageiros);
		this.qtdePortas = qtdePortas;
		this.possuiArCondicionado = possuiArCondicionado;
		this.possuiVidrosEletricos = possuiVidrosEletricos;
		this.tipoCambio = tipoCambio;
		this.possuiTetoSolar = possuiTetoSolar;
		
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public boolean isPossuiArCondicionado() {
		return possuiArCondicionado;
	}

	public void setPossuiArCondicionado(boolean possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	public boolean isPossuiVidrosEletricos() {
		return possuiVidrosEletricos;
	}

	public void setPossuiVidrosEletricos(boolean possuiVidrosEletricos) {
		this.possuiVidrosEletricos = possuiVidrosEletricos;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public boolean isPossuiTetoSolar() {
		return possuiTetoSolar;
	}

	public void setPossuiTetoSolar(boolean possuiTetoSolar) {
		this.possuiTetoSolar = possuiTetoSolar;
	}

	@Override
	public String toString() {
		return "Terrestre [qtdePortas=" + qtdePortas + ", possuiArCondicionado=" + possuiArCondicionado
				+ ", possuiVidrosEletricos=" + possuiVidrosEletricos + ", tipoCambio=" + tipoCambio
				+ ", possuiTetoSolar=" + possuiTetoSolar + "]";
	}
}