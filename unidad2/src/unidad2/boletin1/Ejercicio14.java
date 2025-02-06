package unidad2.boletin1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dime la calificación (0-100): ");
		int calificacion = input.nextInt();
		
		if (calificacion <100 && calificacion >=90)  {
			System.out.println("A");
		}
		else if (calificacion<90 && calificacion >=80) {
			System.out.println("B");
		}
		else if (calificacion<80 && calificacion >=70) {
			System.out.println("C");
		}
		else if (calificacion<70 && calificacion >=60) {
			System.out.println("D");
		}
		else if (calificacion <60) {
			System.out.println("F");
		}
		
		
		
	}
	
}
