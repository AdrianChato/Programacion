package boletin3.ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestionBanco {

	public static void main(String[] args) {
		
		Persona titular = new Persona ("12345678T", "Juanki", "Problematik", LocalDate.of(2004, 10, 12));
		Persona autorizada = new Persona("83670346N", "Paipi", "Papa",  LocalDate.of(2004, 10, 12)); 
		CuentaBancaria cuenta = new CuentaBancaria(0.0, "ES0943257982423429345", titular);
		cuenta.setAutorizado(autorizada);
		cuenta.ingresardinero(autorizada, 100);
		System.out.println(cuenta);
		
		
	}

}
