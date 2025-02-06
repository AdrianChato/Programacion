package unidad2.boletin1;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1. Asignar Surtidor");
			System.out.println("2. Consultar estado");
			System.out.println("3. Asignar Precio");
			System.out.println("4. Recargar Surtidor");
			System.out.println("5. Cerrar");
			System.out.println("Dime la opcion (1-5): ");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Asignalo...");
				break;
			case 2:
				System.out.println("Consultando estado...");
			case 3:
				System.out.println("Asigna Precio...");
			case 4:
				System.out.println("Recargando...");
			case 5:
				System.out.println("Cerrando programa...");
				default:
					System.out.println("Intentalo de nuevo");
			}
		} while (opcion!=5);
	}
}
