package controlador;

import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
import modelo.Pez;

public class GestionaAnimales {

	public static void main(String[] args) {
		Animal p = new Perro();
		Animal p2 = new Gato();
		Animal p3 = new Pez();
		System.out.println(p.getAlimento());
		System.out.println(p.getSonidoqueemite());
		
		System.out.println(p2.getAlimento());
		System.out.println(p2.getSonidoqueemite());
		
		System.out.println(p3.getAlimento());
		System.out.println(p3.getSonidoqueemite());
	}

}
