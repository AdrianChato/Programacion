package modelo.boletin1abstract;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {

	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechanacimiento;
	
	public Mascotas(String nombre, int edad, String estado, LocalDate fechanacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}



	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(edad, estado, fechanacimiento, nombre);
	}



	@Override
	public boolean equals(Object obj) {
		this.getClass().getName();
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascotas other = (Mascotas) obj;
		return edad == other.edad &&  Objects.equals(nombre, other.nombre);
	}



	public abstract String muestra();
	public abstract boolean habla();
	
	
	public LocalDate cumpleaños() {
		return getFechanacimiento();
	}
	
	public boolean morir() {
		if (edad>20) {
			return true;
		} else {
			return false;
		}
	}
}
