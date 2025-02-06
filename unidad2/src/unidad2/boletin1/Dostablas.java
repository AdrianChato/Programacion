package unidad2.boletin1;

import java.util.Scanner;

public class Dostablas {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabla [] = {1,2,3,4};
		int tabla2 [] = {1,2,3,4};
		int pos = 0;
		if (tabla.length != tabla2.length) {
			System.out.println("No son iguales");		}
		while (tabla[pos] == tabla2[pos]) {
			
			boolean iguales = true;
			if (tabla[pos] == tabla2[pos]) {
				System.out.println("Son iguales");
				iguales = false;
			}
			else if (tabla[pos] != tabla2[pos]) {
				System.out.println("Son distintas");
			}
			pos++;
		}

	}

}