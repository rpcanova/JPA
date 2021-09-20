package com.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="Aquatico" )
public class Aquatico extends Veiculo {
	
	private int qtdeBotesSalvaVidas;
	private int qtdeColetesSalvaVidas;
	
	public Aquatico() {
		super();
	}

	public Aquatico(int idVeiculo, String modelo, int potencia, int anoFabricacao, String fabricante,
			int capacidadePassageiros, int qtdeBotesSalvaVidas, int qtdeColetesSalvaVidas) {
		super(idVeiculo, modelo, potencia, anoFabricacao, fabricante, capacidadePassageiros);
		this.qtdeBotesSalvaVidas = qtdeBotesSalvaVidas;
		this.qtdeColetesSalvaVidas = qtdeColetesSalvaVidas;
	}

	public int getQtdeBotesSalvaVidas() {
		return qtdeBotesSalvaVidas;
	}

	public void setQtdeBotesSalvaVidas(int qtdeBotesSalvaVidas) {
		this.qtdeBotesSalvaVidas = qtdeBotesSalvaVidas;
	}

	public int getQtdeColetesSalvaVidas() {
		return qtdeColetesSalvaVidas;
	}

	public void setQtdeColetesSalvaVidas(int qtdeColetesSalvaVidas) {
		this.qtdeColetesSalvaVidas = qtdeColetesSalvaVidas;
	}

	@Override
	public String toString() {
		return "Aquatico [qtdeBotesSalvaVidas=" + qtdeBotesSalvaVidas + ", qtdeColetesSalvaVidas="
				+ qtdeColetesSalvaVidas + "]";
	}
}