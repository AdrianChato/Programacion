package EjemploEnum;

import EjemploEnum.Ejemplo;

public class Principal {

	public static void main(String[] args) {
		Ejemplo dia = Ejemplo.LUNES;
		System.out.println(dia);
		
		for (Ejemplo dia2: Ejemplo.values()) {
			if (dia2 == Ejemplo.JUEVES) {
				System.out.println("Hoy es jueves ");
			}
		}

	}

}
