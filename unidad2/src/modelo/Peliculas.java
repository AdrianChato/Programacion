package modelo;

public class Peliculas extends Multimedia{

	private int minutos;

	public Peliculas(int id, String ubicacion, String nombre, String generoliterario, int minutos) {
		super(id, ubicacion, nombre, generoliterario);
		this.minutos = minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public boolean estaDisponible() {
		
		return false;
	}
	
	
}
