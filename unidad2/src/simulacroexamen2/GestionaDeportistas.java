package simulacroexamen2;

import java.time.LocalDate;

public class GestionaDeportistas {

	public static void main(String[] args) {
		Prueba [] pruebas = new Prueba[50];
		Deportistas c = new Corredor("Juanki", "Rumania", 69, 23541, 183);
		Prueba p = new Prueba("prueba1", "Sevilla", LocalDate.now().plusDays(110), EstadoPrueba.PLANIFICADA);
		Prueba p1 = new Prueba("prueba2", "Villaverde", LocalDate.now().plusDays(10), EstadoPrueba.PLANIFICADA);
		pruebas[0] = p;
		pruebas[1] = p1;
		c.setListapruebas(pruebas);
		System.out.println(c.getpruebamascercana());
	}
}
