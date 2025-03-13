package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        try {
	        int numero = scanner.nextInt(); 
	        System.out.println("detras del input: ");
	        }
	        catch (InputMismatchException adrian)
	        {
	        System.out.print("Entro en el catch ");
	        }
	        finally {
	        	System.out.println("Pase lo que pase, salgo");
	        }
	    }
	}
