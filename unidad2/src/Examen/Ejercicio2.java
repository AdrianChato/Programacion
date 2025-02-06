package Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Adrian Solis Leon 1ºDAM
		// TODO Auto-generated method stub
		//Recibimos un texto por teclado, y buscamos palabras que tengan dos vocales consecutivas
		//Creamos una lista en la que añadimos el texto pedido por teclado

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String palabras = input.nextLine();
		String [] texto = palabras.split(", ");
		int contador = 0;
		for (int pos = 0; pos<texto.length; pos++) {
			System.out.println(texto[pos]);
		}
		}
	
	}


