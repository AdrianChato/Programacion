package simulacroexamen1;

public abstract class Vehiculo implements IAlquilable {

	private int identificador;
	private Alquiler[] alquileres;
	private boolean disponible;

	public Vehiculo(int identificador, Alquiler[] alquileres, boolean disponible) {
		super();
		this.identificador = identificador;
		this.alquileres = alquileres;
		this.disponible = disponible;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public abstract double getImporteTotal();
}
