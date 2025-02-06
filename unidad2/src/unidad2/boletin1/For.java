package unidad2.boletin1;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el numero de triangulos: ");
		int numero = input.nextInt();
		String cadena = "";
		System.out.println("Triangulo: ");
		for (int i = 1; i<= numero; i++) {
			cadena = cadena + "*";
			System.out.println(cadena);
		}
		

	}

}
