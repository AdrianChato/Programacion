package modelo.boletin1abstract;

import java.time.LocalDate;

public class Canario extends Aves{
	private String color;
	private boolean canta = true;
	
	public Canario(String nombre, int edad, String estado, LocalDate fechanacimiento, boolean pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechanacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	

	@Override
	public String toString() {
		return "Canario [color=" + color + ", canta=" + canta + ", isPico()=" + isPico() + ", isVuela()=" + isVuela()
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
		return false;
	}
	
	

}
