package modelo;

public class EstudianteEmpleado extends Estudiante {
	
	
	public EstudianteEmpleado(String nombre) {
		super(nombre);
	}

	public void trabajar() {
		System.out.println(nombre + " está estudiando y trabajando.");
	}
}

// Agregamos otra clase con otro comportamiento
