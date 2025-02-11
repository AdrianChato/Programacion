package trabajoentorno;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","Z"};
		
		// Funcion para calcular letra del dni 
		//guardamos letra en lista de cadenas
		//
	
	
		}
	
	int letradni (Scanner input) {
	System.out.println("Dime los números de un dni: ");
	int dni = input.nextInt();
	int letra = (dni)/23;
	return letra;

}
	
}