package herencia2;

public class Caballero extends Personaje{

	public Caballero(String nombre, int nivel, int puntosvida) {
		super(nombre, nivel, puntosvida, "Espada");
	}

	boolean esAtacado (Personaje p) {
		boolean atacado;
		if (p instanceof Mago) {
			atacado = true;
		} else if (p instanceof Arquero) {
			atacado = true;
		} else {
			atacado = false;
		}
			
		return atacado;
	}
	
	boolean esAtacado (Personaje p,int distancia) {
		boolean atacado;
		if (p instanceof Mago) {
			atacado = true;
		} else if (p instanceof Arquero && distancia >100) {
			atacado = true;
		} else {
			atacado = false;
		}
		return atacado;
	}
	
}
