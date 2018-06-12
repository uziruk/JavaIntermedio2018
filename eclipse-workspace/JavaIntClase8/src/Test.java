import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test {

	public static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	public static void main(String[] args) {
		
		int ejecutar = 1;
		
		String[] opciones = {"Agregar una pelicula", "Modificar estado de una DVD", "Pedir info sobre una pelicula", "Pedir informacion sobre las peliculas en general"};
		while (ejecutar ==1 ){
		int eleccion = JOptionPane.showOptionDialog(null,  "Gracias por usar Pedo Inc. Sfotware\n ¿Que operacion desea realizar?", "Entrada", 1, 1, null, opciones, 0);
		switch (eleccion) {
		case 0: 
			
			String[] formatoOpciones = {"DVD", "BlueRay"};
			
			int eleccionFormato = JOptionPane.showOptionDialog(null, "Usted a elegido para agreagar una pelicula, por favor seleccione el formato",
						"agregar pelicula", 1, 1, null, formatoOpciones, 0);
			
			int idPelicula = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de ID de la pelicula"));
			String titulo = JOptionPane.showInputDialog("Por favor ingrese el titulo de la pelicula");
			int añoPeli = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el año de la pelicula"));
			
				if (eleccionFormato==0) {
				
				int alquiladoInt = JOptionPane.showConfirmDialog(null, "¿Esta este DVD alquilado?");
				boolean alquilado = (alquiladoInt != 0);
				peliculas.add(new Dvd (idPelicula, titulo, añoPeli, alquilado));
				}
			
				else { 
				
				String idioma = JOptionPane.showInputDialog("Por favor ingrese el idioma del BlueRay.");
				peliculas.add(new BlueRay(idPelicula, titulo, añoPeli, idioma));
			}
				break;
			
		case 1:
			String[] opcionesAlquiler = {"alquilar un DVD", "devolver un DVD"};
			int eleccionAlquiler = JOptionPane.showOptionDialog(null, "Que operacion desea realizar", "Alquiler", 1, 1, null, opcionesAlquiler, 0);
			String dvdNombre = JOptionPane.showInputDialog("¿Cual es el nombre del DVD?");
			if (peliculas.contains(dvdNombre) && peliculas.get(getIndex(dvdNombre)) instanceof Dvd) {
				switch (eleccionAlquiler) {
				case 0:
					Dvd dvda = (Dvd) peliculas.get(peliculas.indexOf(dvdNombre));
					dvda.alquilar();
					break;
				case 1:
					Dvd dvdb = (Dvd) peliculas.get(peliculas.indexOf(dvdNombre));
					dvdb.devolver();
				break;
				}
			}
			break;
		case 2:
			String peliculaNombre = JOptionPane.showInputDialog("¿Sobre que pelicula desea saber informacion?");
			peliculas.get(getIndex(peliculaNombre)).toString();
			break;
		case 3: 
			//cuantos alquilados
			//cuales son de este año actual
			
		}
			
		}
		
	}
	public static int getIndex(String nombre)
	{
		System.out.println("llego a 1" + nombre);
	    for (int i = 0; i < peliculas.size(); i++)
	    {
	    	System.out.println("llego a 2" + nombre );
	        Pelicula pelicula = peliculas.get(i);
	        if (nombre.equals(pelicula.getTitulo()))
	        {
	        	System.out.println("llego a 3" + nombre + i);
	            return i;
	        }
	    } 

	    return -1;
	}
}