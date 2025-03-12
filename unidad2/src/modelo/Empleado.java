package modelo;

public class Empleado extends PersonaRefactoriza implements IAccion {


	@Override
	public String ejecutaAccion() {
	return "Trabaja";		
	}

	@Override
	public String toString() {
		return "Empleado [ejecutaAccion()=" + ejecutaAccion() + "]";
	}
	
	
	
}
