package com.utn.vista;

import java.util.ArrayList;

public abstract class Jugador {

	protected String nombre;
	protected String apellido;
	protected int numeroCamiseta;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	Jugador(String nombre, String apellido, int numeroCamiseta){
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCamiseta = numeroCamiseta;
	}
	
	abstract int calcPuntos();
	
	public static Jugador calcMejorPuntaje(ArrayList<Jugador> arrayJugadores) {
		int mejorPuntaje = 0;
		Jugador mejorJugador = null;
		for (Jugador jugador : arrayJugadores) {
			if (mejorPuntaje < jugador.calcPuntos()) {
				mejorPuntaje = jugador.calcPuntos();
				mejorJugador = jugador;
			}
		}
		return mejorJugador;
		
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", numeroCamiseta=" + numeroCamiseta;
	}
}
