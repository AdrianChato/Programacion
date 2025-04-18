package modelo;

public class Libro extends Recursos{

	private String autor;
	private String editorial;
	private String generoliterario;
	private int diasprestamo;
	
	public Libro(int id, String ubicacion, String autor, String editorial, String generoliterario) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.generoliterario = generoliterario;
		this.diasprestamo = 21;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGeneroliterario() {
		return generoliterario;
	}

	public void setGeneroliterario(String generoliterario) {
		this.generoliterario = generoliterario;
	}

	public int getDiasprestamo() {
		return diasprestamo;
	}

	public void setDiasprestamo(int diasprestamo) {
		this.diasprestamo = diasprestamo;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return getDiasprestamo();
	}
	
	
}

