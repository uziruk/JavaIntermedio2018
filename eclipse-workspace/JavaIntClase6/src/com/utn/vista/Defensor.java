package com.utn.vista;

public class Defensor extends Jugador {
	
	private int recuperos;
	private int pelotasPerdidas;

	Defensor(String nombre, String apellido, int numeroCamiseta, int recuperos, int pelotasPerdidas) {
		super(nombre, apellido, numeroCamiseta);
		// TODO Auto-generated constructor stub
		this.recuperos = recuperos;
		this.pelotasPerdidas = pelotasPerdidas;
	}
	@Override
	public String toString() {
		return nombre + " " + apellido + " es Defensor y tiene " + calcPuntos() + " puntos";
	}
	@Override
	int calcPuntos() {
		// TODO Auto-generated method stub
		return recuperos-pelotasPerdidas;
	}

}
