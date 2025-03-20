package simulacroexamen1;

import java.time.LocalDate;

public abstract class Vehiculo implements IAlquilable {

	private int identificador;
	private Alquiler[] alquileres;
	private boolean disponible;
	private LocalDate fecharegistro;

	public Vehiculo(int identificador, Alquiler[] alquileres, boolean disponible, LocalDate fecharegistro) {
		super();
		this.identificador = identificador;
		this.alquileres = alquileres;
		this.disponible = disponible;
		this.fecharegistro = fecharegistro;
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

	public LocalDate getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public abstract double getImporteTotal();
}
