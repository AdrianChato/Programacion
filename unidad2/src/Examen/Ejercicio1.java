package Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primero una funcion de menu
		//el menu tiene 4 llamadas, capturar pokemon, realizar batalla, mostrar pokedex y finalizar
		Scanner input = new Scanner (System.in);
        Ejercicio1 f = new Ejercicio1();
        int opcion = f.imprimeMenu(input);
        
        
        while (opcion < 4) {
            switch (opcion) {
                case 1:
                    f.nombrePokemon(input);
                    f.nivelPokemon(input);
                    break;
                case 2:
                    f.realizaBatalla(input);
                    break;
                case 3:
                	System.out.println("1." + f.nombrePokemon(input) +"- Nivel" + f.nivelPokemon(input));
                	System.out.println("2." + f.nombrePokemon(input) +"- Nivel" + f.nivelPokemon(input));
                default:
                    System.out.println("Elige una opción válida");
                    f.imprimeMenu(input);
            }
        }

        if (opcion == 4) {
            System.out.println("Tu equipo tiene x pokemons. Su nivel medio es x. Han realizado x batllas hasta ahora");
        }

	}
	int imprimeMenu (Scanner input) {
		System.out.println("Elige una opción: ");
        System.out.println("1. Capturar pokemon");
        System.out.println("2. Realizar batalla");
        System.out.println("3. Mostrar pokedex");
        System.out.println("4. Finalizar");
        int opcion = input.nextInt();
        return opcion;
	}
	
	String [] nombrePokemon (Scanner input) {
		String [] nombrePoke = new String[200];
		int i = 0;
		System.out.println("Cual es el nombre del pokemon? ");
		String nombre = input.next();
		nombre = nombrePoke[i];
		i++;
		return nombrePoke;
	}
	int [] nivelPokemon (Scanner input) {
		int [] nivelPoke = new int[200];
		int i = 0;
		System.out.println("Cual es el nivel del pokemon? ");
		int nombre = input.nextInt();
		nombre = nivelPoke[i];
		i++;
		return nivelPoke;
}
	String realizaBatalla (Scanner input) {
		String resultado = "";
		System.out.println("Dime la posicion de los pokemon: ");
		int posicionpokemon = input.nextInt();
		
		
		
		
		return resultado; 
	}
		 
	}
	
