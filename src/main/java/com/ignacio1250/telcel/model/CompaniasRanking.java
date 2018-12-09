package com.ignacio1250.telcel.model;

public class CompaniasRanking {
private String nombre;
private int totalRecargas;
public CompaniasRanking(String nombre, int totalRecargas) {
	this.nombre=nombre;
	this.totalRecargas=totalRecargas;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getTotalRecargas() {
	return totalRecargas;
}
public void setTotalRecargas(int totalRecargas) {
	this.totalRecargas = totalRecargas;
}

}
