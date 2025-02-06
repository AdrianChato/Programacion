package unidad2;

import java.util.Scanner;

public class Repasocadena {

	public static void main(String[] args) {

		Repasocadena f = new Repasocadena();

		Scanner sc = new Scanner(System.in);

		String[] palabras = f.cargaTabla();

		f.imprimeTabla(palabras);

		String[] nums = f.cargaNumeros(palabras);

		f.imprimeTabla(nums);
		String [] minusculas = f.cargaCadenasMinusculas(palabras);
		f.imprimeTabla(minusculas);

	}

	String[] cargaTabla() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Indica una frase: ");

		String frase = sc.nextLine();

		String[] tabla = frase.split(" ");

		return tabla;

	}

	// funcion para imprimir tabla por valor

	void imprimeTabla(String[] tabla) {

		for (String elemento : tabla) {

			System.out.println(elemento);

		}

		// no se pone return

	}

	// Muestra de la lista los que son numeros

	String[] cargaNumeros(String[] tabla) {

		String[] numeros = new String[tabla.length];

		for (int i = 0; i < tabla.length; i++) {

			// si tabla [i] == numero se guarda

			// pasamos la posicion de cada cadena para ver si es o no

			if (cadenaEsNumero(tabla[i])) {

				numeros[i] = tabla[i];

			}

			else {

				numeros[i] = " ";

			}

		}

		return numeros;

	}

	// usamos esta función para ver si es numero en la funcion anterior

	boolean cadenaEsNumero(String palabra) {

		boolean es = true;

		for (int i = 0; i < palabra.length(); i++) {

			Character c = palabra.charAt(i); // devuelve caracter de la posición i

			es = es && Character.isDigit(c);

		}

		return es;

	}

	String[] cargaCadenasMinusculas(String[] tabla) {

		String[] minuscula = new String[tabla.length];

		for (int i = 0; i<tabla.length; i++) {
			if (esMinuscula(tabla[i])) {
				minuscula[i] = tabla[i];
			}
		}
		return minuscula;

	}

	boolean esMinuscula(String palabra)

	{

		boolean esMin = false;

		if (Character.isLowerCase(palabra.charAt(0))) {
			esMin = true;
		}
		
		return esMin;

	}
	
	String realizaConversion(String palabra) {
        String palabraConvertida="";
        //Convierto el primer caracter a mayúsculas
        //Si es un una 0 lo cambio por 0
        //Cambio último caracter a la longitud de la palabra
        return palabraConvertida;
	}
	String [] conviertetabla (String [] palabras) {
		
		String [] convertidas = new String [palabras.length];
		return convertidas;
	}
	
}