package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Ejercicio1 f = new Ejercicio1();

		System.out.println(f.sumaCifra());

	}

	int sumaCifra() {

		int resultado = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime el primer número para sumur sus cifras: ");

		String num1 = sc.next();

		System.out.print("Dime el segundo número: ");

		int num2 = sc.nextInt();

		if (datoValido(num1, num2)) {


			for (int i = 0; i < num2; i++) {
				String cifra = Character.toString(num1.charAt(i));

				int numCifra = Integer.parseInt(cifra);
				resultado = numCifra + resultado;
			}

		}

		sc.close();
		return resultado;

	}

	boolean datoValido(String num1, int num2) {

		boolean valido = false;

		if (num2 < num1.length()) {

			valido = true;

		}

		return valido;

	}

}