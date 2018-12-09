package com.ignacio1250.telcel.commons;

public class BodyRequestRecarga {
private String numero;
private String company;
private int monto;
public String getNumero() {
	return numero;
}
public void setNumero(int numero) {
	
	this.numero = Integer.toString(numero);
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
