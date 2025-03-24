package Simulacroult;

import java.util.Objects;

public abstract class Empleados implements ActualizableSueldo {

	private String dni;
	private String nombre;
	private int sueldo;

	public Empleados(String dni, String nombre, int sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, sueldo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(dni, other.dni);
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

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


}
