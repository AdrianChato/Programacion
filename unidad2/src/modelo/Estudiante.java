package modelo;

public class Estudiante extends PersonaRefactoriza implements IAccion {


	@Override
	public String ejecutaAccion() {
		return "Estudio";
		
	}

	@Override
	public String toString() {
		return "Estudiante [ejecutaAccion()=" + ejecutaAccion() + "]";
	}
	
	
}	