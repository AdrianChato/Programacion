package controlador;

import modelo.Circunferencia;
import modelo.Triangulo;
import modelo.Figura;

public class GestionaFiguras {

	public static void main(String[] args) {
		
		Figura a = new Triangulo("Rojo", 5, 6);
		Figura a2 = new Circunferencia("verde", 6);
		
		System.out.println(a.calcularArea());
		System.out.println(a2.calcularArea());


	}

}
