package unidad2;

import java.util.Scanner;

public class Repasotabla {

	public static void main(String[] args) {
		Repasotabla f = new Repasotabla();
		int [] tablaResultado = f.calculaTabla();
		for (int valor : tablaResultado) {
			System.out.println(valor);
		}
	}

	int [] calculaTabla() {
		Scanner input = new Scanner(System.in);
		int [] tabla = new int[10];
		for (int i=0; i<tabla.length; i++) {
			System.out.print("Dame un numero:  ");
			tabla[i] = input.nextInt()
;
			}
		
		
		return tabla;
	}
	boolean buscaelemento (int numero, int [] tabla) {
		
		int i = 0;
		boolean encontrado = false;
		while (!encontrado && i < tabla.length) {
			
			if (tabla[i] == numero) {
				encontrado = true;
			}
			i = i+1;
		}
		return encontrado;
	}
}
