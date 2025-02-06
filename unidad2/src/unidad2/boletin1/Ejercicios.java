package unidad2.boletin1;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		float descuento, precio;
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Dime la edad: ");
		int edad = input.nextInt();
		
		descuento = (edad > 60) ? 0.3F : 0.1F;

		System.out.println("Dime el precio del producto para calcular el valor final: ");
		precio = input.nextFloat();
		precio = precio - descuento *precio;
		System.out.println("El precio final es: " +precio);*/
		
		int expresion = 0;
		switch (expresion) {
		case 0:
			System.out.println("Dios");
			break;
		case 1:
			System.out.println("Santo");
			break;
			default:
				System.out.println("Hola");
		}
	}
}
