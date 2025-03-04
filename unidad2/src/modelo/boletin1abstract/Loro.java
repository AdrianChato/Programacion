package modelo.boletin1abstract;

import java.time.LocalDate;

public class Loro extends Aves{

	private String origen;
	private boolean habla;
	
	public Loro(String nombre, int edad, String estado, LocalDate fechanacimiento, boolean pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, edad, estado, fechanacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	@Override
	public String toString() {
		return "Loro [origen=" + origen + ", habla=" + habla + ", isPico()=" + isPico() + ", isVuela()=" + isVuela()
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getEstado()=" + getEstado()
				+ ", getFechanacimiento()=" + getFechanacimiento() + "]";
	}

	@Override
	public boolean volar() {
		return true;
	}

	@Override
	public String muestra() {
		return toString();
	}

	@Override
	public boolean habla() {
		return true;
	}
	
	public boolean saluda() {
		return true;
	}
	
	
	
	
}
