package modelo.boletin1abstract;

import java.time.LocalDate;

public class Gato extends Mascotas{

	private String color;
	private boolean pelolargo;
	public Gato(String nombre, int edad, String estado, LocalDate fechanacimiento, String color, boolean pelolargo) {
		super(nombre, edad, estado, fechanacimiento);
		this.color = color;
		this.pelolargo = pelolargo;
	}
	@Override
	public String toString() {
		return "Gato [color=" + color + ", pelolargo=" + pelolargo + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + ", getEstado()=" + getEstado() + ", getFechanacimiento()=" + getFechanacimiento() + "]";
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
