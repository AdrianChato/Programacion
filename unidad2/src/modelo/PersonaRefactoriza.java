package modelo;

import java.util.Arrays;

public class PersonaRefactoriza {

	String nombre;
	IAccion[] acciones;
	
	

	public PersonaRefactoriza() {
		super();
		this.acciones = new IAccion[10];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IAccion[] getAcciones() {
		return acciones;
	}

	public void setAcciones(IAccion[] acciones) {
		this.acciones = acciones;
	}

	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new IAccion[10];
	}

	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + nombre);
	}

	@Override
	public String toString() {
		return "PersonaRefactoriza [nombre=" + nombre + ", acciones=" + Arrays.toString(acciones) + "]";
	}
	
	
}
