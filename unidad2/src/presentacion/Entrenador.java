package presentacion;

import java.util.Objects;

public class Entrenador extends Persona{

	private String idfederacion;

	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entrenador(String nombre, String apellidos, int edad, float salario, String idfederacion) {
		super(nombre, apellidos, edad, salario);
		this.idfederacion = idfederacion;
	}
	
	public Entrenador(String nombre, String apellidos, int edad, float salario) {
		super(nombre, apellidos, edad, salario);
		this.idfederacion = "ESP";
	}



	protected String getIdfederacion() {
		return idfederacion;
	}

	protected void setIdfederacion(String idfederacion) {
		this.idfederacion = idfederacion;
	}


	@Override
	public String toString() {
		return "Entrenador [idfederacion=" + idfederacion + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + "]";
	}

	@Override
	protected void concentrarse() {
		System.out.println("Concentrate bro entrenador");
	}
	protected void concentrarse(int num) {
		System.out.println("Concentrate brotherr entrenadorrr"+num);
	}
	
	@Override
	protected void viajar (String lugar) {
		System.out.println("Vieaje entrenador");
	}
	protected void dirigirpartido() {
		System.out.println("Dirige partido mister");
	}
}
