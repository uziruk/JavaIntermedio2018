package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test {
	
	final static int ARQUERO = 0;
	final static int DEFENSOR = 1;
	final static int MEDIOCAMPISTA = 2;
	final static int DELANTERO = 3;
	
	public static void main(String[] args) {
		String[] roles = {"Arquero", "Defensor", "Mediocampista", "Delantero"};
		int cantJugadores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos jugadores desea ingresar?"));
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		
		
		for (int i = 0; i<cantJugadores; i++) {
			int tipoJugador = JOptionPane.showOptionDialog(null, "Que tipo de jugador deasea ingresar?", "Tipo de jugador", 1, 1, null, roles, 0);

			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
			String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
			int numeroCamiseta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de camiseta: "));

			switch (tipoJugador) {

			case ARQUERO:
				jugadores.add(new Arquero(nombre, apellido, numeroCamiseta,
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de pelotas atajadas: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de golesreibidos: "))));
				break;
				
			case DEFENSOR:
				jugadores.add(new Defensor(nombre, apellido, numeroCamiseta,
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de recuperos: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pelotasPerdidas: "))));
				break;
				
			case MEDIOCAMPISTA:
				jugadores.add(new Mediocampista(nombre, apellido, numeroCamiseta,
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de Pases Bien Hechos: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Pases Errados: "))));
				break;
				
			case DELANTERO:
				jugadores.add(new Delantero(nombre, apellido, numeroCamiseta,
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de Goles Convertidos: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Goles Errados: "))));
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "No es valido");
				
			}
		}

		Jugador mejorJugador = Jugador.calcMejorPuntaje(jugadores);
		JOptionPane.showMessageDialog(null, "El mejor jugador es " + mejorJugador.getNombre() + " "
				+ mejorJugador.getApellido() + " con " + mejorJugador.calcPuntos() + " puntos");

	}
}
