package boletin3.ejercicio3;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimineto;
	


	public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimineto) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimineto = fechaNacimineto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimineto() {
		return fechaNacimineto;
	}

	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimineto="
				+ fechaNacimineto + "]";
	}
	
	
	
	
}
