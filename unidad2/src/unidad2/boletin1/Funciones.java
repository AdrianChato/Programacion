package unidad2.boletin1;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Funciones f = new Funciones();
		String []resultado = f.generaLista();
		System.out.println(resultado);
		}
		String [] generaLista () {
			Scanner input = new Scanner(System.in);
			String [] tabla = new String[5];
			for (int i = 0; i<5; i++) {
				System.out.println("Dime un nombre: ");
				String nombre = input.next();
				tabla[i] = nombre;
				System.out.println(tabla[i]);
			}
			for (String nombre: tabla) {
				System.out.println(nombre);
			}
			return tabla;
		}


	int sumaNum (int num1, int num2) {
		
		return num1 + num2;
	}
	
}
