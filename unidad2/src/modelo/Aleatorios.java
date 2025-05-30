package modelo;

import java.util.Arrays;
import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		Double [] divisiones = new Double[20];
		Random r = new Random();
		for(int i =0; i<3; i++) {
		try {
		int num1 = r.nextInt();
		int num2 = r.nextInt();
		
		if (num2==0) {
			throw new ArithmeticException("No puedes dividir por 0");
		}
		if (i>20) {
			throw new ArrayIndexOutOfBoundsException("Guardando mas de 20");
		}
		divisiones[i] = (double) (num1/num2);
		}
		catch(ArithmeticException e1) {
			System.out.println("Ha salido un 0 de denominador");
			//throw e1;
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2.getMessage());
			//throw e2;
		}
		finally {
			try {
				for (int j =0;j<divisiones.length;j++) {
					if(divisiones[j] == null) {
						throw new NullPointerException("Aqui no hay nada");
					}
					System.out.println(divisiones[j]);
				}
			}
			catch(NullPointerException e3) {
				System.out.println(e3.getMessage());
				throw e3;
			}
		}
	}
	}
}
