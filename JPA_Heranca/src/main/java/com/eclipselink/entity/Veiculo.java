package com.eclipselink.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "TIPO")
public class Veiculo implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int idVeiculo;
	
	private String modelo;
	private int potencia;
	private int anoFabricacao;
	private String fabricante;
	private int capacidadePassageiros;
	
	public Veiculo() {
		super();
	}

	public Veiculo(int idVeiculo, String modelo, int potencia, int anoFabricacao, String fabricante,
			int capacidadePassageiros) {
		super();
		this.idVeiculo = idVeiculo;
		this.modelo = modelo;
		this.potencia = potencia;
		this.anoFabricacao = anoFabricacao;
		this.fabricante = fabricante;
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	@Override
	public String toString() {
		return "Veiculo [idVeiculo=" + idVeiculo + ", modelo=" + modelo + ", potencia=" + potencia + ", anoFabricacao="
				+ anoFabricacao + ", fabricante=" + fabricante + ", capacidadePassageiros=" + capacidadePassageiros
				+ "]";
	}
}