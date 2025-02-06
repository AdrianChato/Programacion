package boletin2;

import java.util.Scanner;

public class Gato {

	String color;
	String raza;
	String sexo;
	int edad;
	float peso;
	
	
	
	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gato(String color, String sexo, int edad, float peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	void maullar () {
		Scanner input = new Scanner(System.in);
		System.out.println("El gato maulla? S/N: ");
		String res = input.next();
		if (res.equals("S")) {
			System.out.println("miauuuuuu");
		}
	}
	void ronronear () {
		Scanner input = new Scanner(System.in);
		System.out.println("El gato ronronea? S/N: ");
		String res = input.next();
		if (res.equals("S")) {
			System.out.println("rrrrr");
		}
	}
	void comer (String comida) {
		if (comida.equals("pescado")) {
			System.out.println("yummy yummy");
		}
		else {
			System.out.println("buah, mejor no");
		}
	} 
	void pelear (Gato gato2) {
        if (sexo.equals(gato2.sexo)) {
            System.out.println("ven aquí que te vas a enterar");
        } else {
            System.out.println("la violencia nunca es la solución");
        }
    }
}
