package modelo.boletin1abstract;

import java.time.LocalDate;

public abstract class Aves extends Mascotas{

	private boolean pico;
	private boolean vuela;
	
	public Aves(String nombre, int edad, String estado, LocalDate fechanacimiento, boolean pico, boolean vuela) {
		super(nombre, edad, estado, fechanacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}
	
	
	
	public boolean isPico() {
		return pico;
	}



	public void setPico(boolean pico) {
		this.pico = pico;
	}



	public boolean isVuela() {
		return vuela;
	}



	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}



	public abstract boolean volar();
}
