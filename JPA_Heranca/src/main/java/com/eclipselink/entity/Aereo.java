package com.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="Aereo" )
public class Aereo extends Veiculo {
	
	private double autonomiaVoo;
	
	public Aereo() {
		super();
	}

	public Aereo(int idVeiculo, String modelo, int potencia, int anoFabricacao, String fabricante,
			int capacidadePassageiros, double autonomiaVoo) {
		super(idVeiculo, modelo, potencia, anoFabricacao, fabricante, capacidadePassageiros);
		this.autonomiaVoo = autonomiaVoo;
	}

	public double getAutonomiaVoo() {
		return autonomiaVoo;
	}

	public void setAutonomiaVoo(double autonomiaVoo) {
		this.autonomiaVoo = autonomiaVoo;
	}

	@Override
	public String toString() {
		return "Aereo [autonomiaVoo=" + autonomiaVoo + "]";
	}
}