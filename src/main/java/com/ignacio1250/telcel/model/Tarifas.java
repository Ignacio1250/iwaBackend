package com.ignacio1250.telcel.model;

public class Tarifas {
	private int tarifa;
	private int cantidad;
	
	public Tarifas(int tarifa, int cantidad) {
		this.tarifa=tarifa;
		this.cantidad= cantidad;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
