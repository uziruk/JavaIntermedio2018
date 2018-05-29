package com.utn.vista;

public class Delantero extends Jugador {
	
	private int golesConvertidos;
	private int golesErrados;

	Delantero(String nombre, String apellido, int numeroCamiseta, int golesConvertidos, int golesErrados) {
		super(nombre, apellido, numeroCamiseta);
		// TODO Auto-generated constructor stub
		this.golesConvertidos =  golesConvertidos;
		this.golesErrados = golesErrados;
	}

	public String toString() {
		return nombre + " " + apellido + " es Delantero y tiene " + calcPuntos() + " puntos";
	}

	@Override
	int calcPuntos() {
		return golesConvertidos-golesErrados;
	}
	
}
