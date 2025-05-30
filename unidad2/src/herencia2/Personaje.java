package herencia2;

import java.util.Objects;

public class Personaje {

	private String nombre;
	private int nivel;
	private int puntosvida;
	private String arma;
	
	public Personaje(String nombre, int nivel, int puntosvida, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosvida = puntosvida;
		this.arma = arma;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getNivel() {
		return nivel;
	}

	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}

	protected int getPuntosvida() {
		return puntosvida;
	}

	protected void setPuntosvida(int puntosvida) {
		this.puntosvida = puntosvida;
	}

	protected String getArma() {
		return arma;
	}

	protected void setArma(String arma) {
		this.arma = arma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arma, nivel, nombre, puntosvida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && nivel == other.nivel && Objects.equals(nombre, other.nombre)
				&& puntosvida == other.puntosvida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosvida=" + puntosvida + ", arma=" + arma
				+ "]";
	}
	
	boolean esAtacado (Personaje p) {
		return true;
	}
	
	boolean esAtacado (Personaje p,int distancia) {
		return true;
	}
}
