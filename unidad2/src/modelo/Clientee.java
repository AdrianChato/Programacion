package modelo;

public class Clientee extends PersonaRefactoriza implements IAccion {

	public String ejecutaAccion() {
		return "Compra";
	}

	@Override
	public String toString() {
		return "Clientee [ejecutaAccion()=" + ejecutaAccion() + "]";
	} 

	

	
	
}
	
	