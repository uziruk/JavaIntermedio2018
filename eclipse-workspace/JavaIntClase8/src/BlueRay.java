
public class BlueRay extends Pelicula{
	public BlueRay(int idPelicula, String titulo, int a�oPeli, String idioma) {
		super(idPelicula, titulo, a�oPeli);
		this.idioma = idioma;
		
	}

	String idioma;

	@Override
	public String toString() {
		return "es un BlueRay [esta en = " + idioma + ", " + super.toString() + "]";
	}
	

}
