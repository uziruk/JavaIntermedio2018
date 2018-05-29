package com.utn.vista;

public class Arquero extends Jugador {

	private int atajadas;
	private int golesRecibidos;
	
	Arquero(String nombre, String apellido, int numeroCamiseta, int atajadas , int golesRecibidos) {
		super(nombre, apellido, numeroCamiseta);
		// TODO Auto-generated constructor stub
		this.atajadas =  atajadas;
		this.golesRecibidos = golesRecibidos;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " es Arquero y tiene " + calcPuntos() + " puntos";
	}

	@Override
	int calcPuntos() {
		// TODO Auto-generated method stub
		return atajadas-golesRecibidos;
	}
	
	
}
