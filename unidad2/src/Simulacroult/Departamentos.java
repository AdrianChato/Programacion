package Simulacroult;

import java.util.Arrays;
import java.util.Objects;

public class Departamentos {

	private String nombre;
	private Empleados [] empleadosdepartamento;
	JefeDepartamento [] jefe;
	
	public Departamentos(String nombre, Empleados[] empleadosdepartamento, JefeDepartamento[] jefe) {
		super();
		this.nombre = nombre;
		this.empleadosdepartamento = new Empleados[100];
		this.jefe = new JefeDepartamento [1];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(empleadosdepartamento);
		result = prime * result + Arrays.hashCode(jefe);
		result = prime * result + Objects.hash(nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamentos other = (Departamentos) obj;
		return Arrays.equals(empleadosdepartamento, other.empleadosdepartamento) && Arrays.equals(jefe, other.jefe)
				&& Objects.equals(nombre, other.nombre);
	}
	
	boolean addempleado (Empleados e) {
		boolean posibleañadir = false;
		for (int i = 0; i>empleadosdepartamento.length;i++) {
			if (e!=(empleadosdepartamento[i]) && posibleañadir == false) {
				empleadosdepartamento[i] = e;
				posibleañadir = true;
			}
			else {
			posibleañadir = false;
		}
		return posibleañadir;
	}
	
}
