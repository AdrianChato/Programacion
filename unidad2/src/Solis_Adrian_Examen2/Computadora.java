package Solis_Adrian_Examen2;

public class Computadora extends Dispositivo{

	private int capacidadram;

	public Computadora(String marca, String modelo, double precio, int capacidadram) {
		super(marca, modelo, precio);
		this.capacidadram = capacidadram;
	}

	protected int getCapacidadram() {
		return capacidadram;
	}

	protected void setCapacidadram(int capacidadram) {
		this.capacidadram = capacidadram;
	}
	
	
}
