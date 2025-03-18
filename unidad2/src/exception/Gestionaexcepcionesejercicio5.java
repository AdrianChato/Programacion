package exception;

import java.util.Scanner;

public class Gestionaexcepcionesejercicio5 {

	public static void main(String[] args) {
		Gestionaexcepcionesejercicio5 r = new Gestionaexcepcionesejercicio5();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		try {
			r.metodo1(num);
		}
		catch (Miexcepcion e) {
			System.out.println(e.getMessage());;
		}
	}
	public void metodo1(int num) throws Miexcepcion {
		try {
			if (num%2!=0) {
				throw new Miexcepcion ("Toma excepcion");
			}
		}
	
		catch (Miexcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}
}
}

