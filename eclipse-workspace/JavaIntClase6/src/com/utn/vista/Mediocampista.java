package com.utn.vista;

public class Mediocampista extends Jugador{
	
	private int pasesBienHechos;
	private int pasesErrados;

	Mediocampista(String nombre, String apellido, int numeroCamiseta, int pasesBienHechos, int pasesErrados) {
		super(nombre, apellido, numeroCamiseta);
		// TODO Auto-generated constructor stub
		this.pasesBienHechos = pasesBienHechos;
		this.pasesErrados = pasesErrados;
		
	}

	public String toString() {
		return nombre + " " + apellido + " es Mediocampista y tiene " + calcPuntos() + " puntos";
	}

	@Override
	int calcPuntos() {
		// TODO Auto-generated method stub
		return pasesBienHechos-pasesErrados;
	}
	
}
