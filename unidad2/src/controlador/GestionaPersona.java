package controlador;

import java.util.Scanner;

import modelo.Persona;

public class GestionaPersona {

	public static void main(String[] args) {
		GestionaPersona g = new GestionaPersona();
		Scanner input = new Scanner(System.in);
		System.out.println("Dame una cadena: ");
		String dni = input.nextLine();
		g.imprimenoestatico();
		GestionaPersona.imprimeestatico();
		
		while (!dni.equals("fin")) {
			if (Persona.validasiDNIValido(dni)) {
				Persona p1 = new Persona(dni, 0);
				System.out.println("DNI valido");
			} else {
				System.out.println("No valido");
			}
			System.out.println("INtroduce de nuevo la cadena: ");
			dni = input.nextLine();
		}
		
		}
	void imprimenoestatico() {
	System.out.println("No estatico");

	}
	
	static void imprimeestatico() {
		System.out.println("Es estatico");

	}
}
