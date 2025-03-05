package modelo;

import java.util.Objects;

public abstract class Robots {

	private int id;
	private static int incremento = 0;
	private String modelo;
	private String nombre;
	private int bateria;
	private String combustible;
	private String descripcion;
	private Estado estadorobots;

	public Robots(String modelo, int bateria, String combustible, String descripcion, Estado estadorobots,
			String nombre) {
		super();
		this.id = incremento+1;
		this.modelo = modelo;
		this.bateria = bateria;
		this.combustible = combustible;
		this.descripcion = descripcion;
		this.estadorobots = estadorobots;
		this.nombre = nombre;
		incremento = incremento + 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIncremento() {
		return incremento;
	}

	public static void setIncremento(int incremento) {
		Robots.incremento = incremento;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstadorobots() {
		return estadorobots;
	}

	public void setEstadorobots(Estado estadorobots) {
		this.estadorobots = estadorobots;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robots other = (Robots) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Robots [id=" + id + ", modelo=" + modelo + ", bateria=" + bateria + ", estadorobots=" + estadorobots
				+ "]";
	}

	public abstract String ejecutartarea();

	public abstract boolean recargar();

	public boolean tienesuficiente() {
		if (bateria > 10) {
			return true;
		} else {
			return false;
		}
	}

	public enum Estado {
		ENCENDIDO, APGADO, ALERTA, AVERIADO
	}
}
