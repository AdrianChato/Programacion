package boletin3;

public class Gestionaequipos {

	public static void main(String[] args) {
		Persona p1 = new Persona ("Juanka", "Problematik", "12234656D",18);
		Persona p2 = new Persona ("David", "totno", "23544656D",23);
		Persona p3 = new Persona ("Ana", "bobo", "345745678H",89);
		Persona p4 = new Persona ("Felipe", "fsdgv", "657896978W",11);

		Persona [] personas1 = {p1,p2};
		Persona [] personas2 = {p3,p4};
		int [] puntuaciones1 = {7,14,22};
		int [] puntuaciones2 = {40,12,3};
		
		Equipo equipo1 = new Equipo("equipo1", puntuaciones1, personas1);
		System.out.println(equipo1);
		Persona [] tablapersonas = equipo1.personas;
		for (int i = 0; i<tablapersonas.length; i++) {
			Persona p = tablapersonas[i];
			System.out.println(p.dni);
		}
		Equipo equipo2 = new Equipo("equipo2", puntuaciones2, personas2);
}
}