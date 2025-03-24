package Simulacroult;

import java.util.Scanner;

public class JefeDepartamento extends Empleados{
	
	public JefeDepartamento(String dni, String nombre, int sueldo, int antiguedad) {
		super(dni, nombre, sueldo);
		this.antiguedad = antiguedad;
	}

	private int antiguedad;
	Scanner input = new Scanner (System.in);
	
	@Override
	public double devuelvesueldo() {
		System.out.println("Introduce el porcentaje: ");
        double porcentaje = input.nextDouble();
        double sueldo = this.getSueldo();
        double resultado = porcentaje/100*sueldo;
        return resultado;
	}
	
	
}
