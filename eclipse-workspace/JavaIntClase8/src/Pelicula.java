
public class Pelicula {

	private int idPelicula;
	private String titulo;
	private int a�oPeli;
	
	public Pelicula(int idPelicula, String titulo, int a�oPeli) {
		
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.a�oPeli = a�oPeli;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "El ID es =" + idPelicula + ",  el titulo es=" + titulo + ", el a�o de la pelicula es =" + a�oPeli + " ";
	}

	
}
