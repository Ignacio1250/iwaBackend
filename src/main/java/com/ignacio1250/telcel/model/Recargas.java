package com.ignacio1250.telcel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recargas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idrecargas;
	private String numero;
	private String company;
	private int monto;
	public Integer getIdrecargas() {
		return idrecargas;
	}
	public void setIdrecargas(Integer idrecargas) {
		this.idrecargas = idrecargas;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	
	
	
}
