package herencia2;

public class Mago extends Personaje{

	public Mago(String nombre, int nivel, int puntosvida) {
		super(nombre, nivel, puntosvida, "Hechizo");
		
	}

	boolean esAtacado (Personaje p) {
		return false;
	}
	
	boolean esAtacado (Personaje p,int distancia) {
		return false;
	}
	
}
