
public class Pelicula {

	private int idPelicula;
	private String titulo;
	private int añoPeli;
	
	public Pelicula(int idPelicula, String titulo, int añoPeli) {
		
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.añoPeli = añoPeli;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "El ID es =" + idPelicula + ",  el titulo es=" + titulo + ", el año de la pelicula es =" + añoPeli + " ";
	}

	
}
