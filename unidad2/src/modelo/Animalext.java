package modelo;

public class Animalext extends SerVivo{

	@Override
	boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void  come() {
		System.out.println("Come");
	}
	public void respira() {
		System.out.println("Respira");
	}

}
