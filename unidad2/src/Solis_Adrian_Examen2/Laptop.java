package Solis_Adrian_Examen2;

public class Laptop extends Computadora{

	private double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadram, double peso) {
		super(marca, modelo, precio, capacidadram);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double calcularpreciodescuento() {
		double descuento = getPrecio() -(getPrecio()*0.12);
		if (getPeso() >2) {
			descuento = descuento - (descuento*0.08);
		} else {
			return descuento;
		}
		return descuento;
	}
	
}
