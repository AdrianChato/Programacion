package modelo;

public class Artista extends PersonaRefactoriza {

	
	public Artista(String nombre) {
		super(nombre);
	}

	public void pintar() {
		System.out.println(nombre + " está pintando.");
	}
}
