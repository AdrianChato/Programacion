package modelo.boletin1abstract;

import java.time.LocalDate;

public class Perro extends Mascotas{

	private String raza;
	private boolean pulgas;
	
	
	public Perro(String nombre, int edad, String estado, LocalDate fechanacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechanacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
		
	}
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + ", getNombre()=" + getNombre() + ", getEdad()="
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
