import javax.swing.JOptionPane;

public class Dvd extends Pelicula implements Alquilable {
	private boolean alquilado;

	public Dvd(int idPelicula, String titulo, int añoPeli) {
		super(idPelicula, titulo, añoPeli);
	}
	
	public Dvd(int idPelicula, String titulo, int añoPeli, boolean alquilado) {
		super(idPelicula, titulo, añoPeli);
		this.alquilado = alquilado;
	}

	@Override
	public void alquilar() {
		JOptionPane.showMessageDialog(null, "La pelicula " + getTitulo() + " ha sido marcada como alquilada.");
		alquilado = true;
		
	}

	@Override
	public void devolver() {
		JOptionPane.showMessageDialog(null, "La pelicula " + getTitulo() + " ha sido marcada como devuelta.");
		alquilado = true;
	}

	@Override
	public boolean esAlquilado() {
		return alquilado;
		
	}

	@Override
	public String toString() {
		return "Es un Dvd [Esta alquilado =" + esAlquilado() + ", " + super.toString()
				+ "]";
	}

}
