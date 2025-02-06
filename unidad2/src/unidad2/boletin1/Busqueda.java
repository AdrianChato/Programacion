package unidad2.boletin1;

import java.util.Scanner;

public class Busqueda {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabla [] = {1,3,4,7};
		System.out.println("Selecciona un número: ");
		int numero = input.nextInt();
		for (int pos = 0; pos<tabla.length; pos++) {
			if (numero == tabla[pos]) {
				System.out.println(pos);
			}
			else {
				if (numero < tabla[pos] && numero > tabla [pos-1]) {
					int i = -pos;
					System.out.println("Numero posición" +i);
				}
			}
		}
	}
}