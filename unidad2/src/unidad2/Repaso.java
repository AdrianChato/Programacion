package unidad2;

import java.util.Scanner;

import unidad2.boletin1.Funciones;

public class Repaso {

	public static void main(String[] args) {
		
		Repaso f = new Repaso();
		Scanner input = new Scanner(System.in);
		System.out.print("Cuantos numeros quieres sumar:  ");
		int numero = input.nextInt();
		System.out.println(f.sumaNumPar(numero, input));

	}

	int sumaNumPar (int x, Scanner input) {
		int resultado = 0;
		for (int i = 0; i<x; i++) {
			Scanner inputt = new Scanner(System.in);
			System.out.print("Dame un numero:  ");
			int xt = inputt.nextInt();
			if (xt %2 == 0) {
				resultado = resultado + x;
			}
		}
		
		return resultado;
	}
}
