
public class BlueRay extends Pelicula{
	public BlueRay(int idPelicula, String titulo, int añoPeli, String idioma) {
		super(idPelicula, titulo, añoPeli);
		this.idioma = idioma;
		
	}

	String idioma;

	@Override
	public String toString() {
		return "es un BlueRay [esta en = " + idioma + ", " + super.toString() + "]";
	}
	

}
