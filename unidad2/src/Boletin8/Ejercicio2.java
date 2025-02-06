package Boletin8;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int numArboles = sc.nextInt();
		
		String [] tipos = new String [200];
		double [] diametro = new double [200];
		double [] altura = new double [200];
		int [] edades = new int [200];
		Ejercicio2 f = new Ejercicio2();
		int numeroArbolesTotales = f.cargaDatos(tipos,diametro,altura,edades);
		double mediaAltura = f.calculaMediaAltura(alturas);
		double alturaMax = f.calculaAlturaMaxima(alturas);
		double alturaMin = f.calculaAlturaMinima(alturas);
		double diamMax = f.calculaDiametroMaximo(diametro);
		double diamMin = f.calculaDiametroMinimo(diametro);
		double mediaEdades = f.calculaMediaEdades(edades);

		if (f.existenMas30metros(altura)) {
			System.out.println("Existen arboles de mas de 30 metros");
		}
	}

	int cargaDatos (String [] tipos, double [] diametro, double  [] altura, int [] edades) {
		int numTipoB = 0;
		Scanner input = new Scanner (System.in);
		for (int i= 0; i<tipos.length; i++) {
			System.out.println("Tipo de arbol");
			tipos[i] = input.next().toUpperCase();
			System.out.println("Diametro");
			diametro [i] = input.nextDouble();
			System.out.println("Altura");
			altura [i] = input.nextDouble();
			System.out.println("Tipo B:");
			if (tipos.equals("B")) {
				
			}
		}
	}
}
