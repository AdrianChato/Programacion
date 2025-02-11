package herencia;

public class Profesor extends Persona {

	protected String departamento;

	public Profesor(String nombre, String apellidos, String dni, String departamento) {
		super(nombre, apellidos, dni);
		this.departamento = departamento;
	}

	protected String getDepartamento() {
		return departamento;
	}

	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	
	
}
