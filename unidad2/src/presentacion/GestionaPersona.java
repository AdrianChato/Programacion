package presentacion;

public class GestionaPersona {

	public static void main(String[] args) {
		Persona p = new Persona("Pepe", "Ortiz", 32, 1500);
		Persona p1 = new Entrenador("Juanka", "viejudo", 37, 1800);
		Entrenador e = new Entrenador("dios", "joven", 19, 1750);
		
		Entrenador p1entrenador = (Entrenador) p1;
		p1entrenador.dirigirpartido();
		
		p.concentrarse();
		p.concentrarse(3);
	}

}
