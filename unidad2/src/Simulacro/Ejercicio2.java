package Simulacro;

/* Funcion llamada a rodondear que reciba numero entero o de texto y si tiene decimales lo redondee a la siguiente
 * otra funcion para validar el numero
 * 
 * calcula numero de decimales (String): int
 * float redondeo3omasdec(String)
 * float redondeo2omenosdec(String)
 * */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un número");
		String numeroCadena = input.next();
		Ejercicio2 f = new Ejercicio2();
		String resultado = f.redondear(numeroCadena);
		System.out.println(resultado);
	}
	String redondear(String numeroARedondear) {
		int numeroDecimales = calculaNumeroDecimales(numeroARedondear);
		String resultado = numeroARedondear;
		if(numeroDecimales >= 3) {
			//resultado = redondeoCon3oMasDecimales(numeroARedondear);
		}
		else if (numeroDecimales < 2) {
			resultado = redondeoCon2oMenosDecimales(numeroARedondear);
		}
		System.out.println(resultado);
		return numeroARedondear;
	}
	String redondeoCon2oMenosDecimales(String numeroARedondear) {
		
		String resultado = numeroARedondear;
		//mientras resultado no tenga dos decimales
		int numeroDecimales = calculaNumeroDecimales(resultado) !=2;
		while (numeroDecimales !=2) {
		if(numeroDecimales ==0) {
			resultado = resultado + "0";
		}
		else {
			resultado = resultado +"0";
		}
		}
		return resultado;
	}
	int calculaNumeroDecimales(String numeroARedondear) {
		//12.1234
		//partes[0] = 12
		//partes[1]= 1234
		int numDecimales;
		
		String [] partes = numeroARedondear.split(",");
		if (partes.length == 2) {
			numDecimales = partes[1].length();
		}
		else {
			
		}
		return partes[1].length();
	}
}