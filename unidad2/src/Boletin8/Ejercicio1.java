package Boletin8;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int grupoA = 25;
		int grupoB = 28;
		int grupoC = 31;
		int grupoD = 29;

		System.out.print("Introduce el grupo (A, B, C, D): ");
		char grupo = sc.next().toUpperCase().charAt(0);

		String nombreMayorNotaMedia = "";
		double mayorNotaMedia = -1;
		int alumnosSuspensos = 0;
		boolean existeJava = false;

		int numeroAlumnos = 0;

		switch (grupo) {
		case 'A':
			numeroAlumnos = grupoA;
			break;
		case 'B':
			numeroAlumnos = grupoB;
			break;
		case 'C':
			numeroAlumnos = grupoC;
			break;
		case 'D':
			numeroAlumnos = grupoD;
			break;
		default:
			System.out.println("Grupo inválido");
			return;
		}

		for (int i = 0; i < numeroAlumnos; i++) {
			sc.nextLine();
			System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
			String nombre = sc.nextLine();

			System.out.print("Introduce la nota del primer parcial: ");
			double nota1 = sc.nextDouble();
			System.out.print("Introduce la nota del segundo parcial: ");
			double nota2 = sc.nextDouble();
			System.out.print("Introduce la nota del tercer parcial: ");
			double nota3 = sc.nextDouble();

			double media = (nota1 + nota2 + nota3) / 3;

			if (media > mayorNotaMedia) {
				mayorNotaMedia = media;
				nombreMayorNotaMedia = nombre;
			}

			if (media < 5) {
				alumnosSuspensos++;
			}

			if (nota1 >= 9 || nota2 >= 9 || nota3 >= 9) {
				existeJava = true;
			}
		}

		System.out.println("El alumno con mayor nota media es: " + nombreMayorNotaMedia);
		System.out.println("Cantidad de alumnos con nota media suspensa: " + alumnosSuspensos);

		if (existeJava) {
			System.out.println("Sobresaliente");
		}
	}
}