package modelo;

public class Circulo {

	private double radio;
	public final static double PI = 3.1416;
	private int id;
	private static int contador;

	public Circulo(double radio) {
		super();
		this.radio = radio;
		this.id = contador+1;
		contador = contador+1;
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id=" + id + ", calculaArea()=" + calculaArea() + "]";
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double calculaArea() {
		return PI*radio*this.radio;
	}

	protected double getRadio() {
		return radio;
	}

	protected void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calculaarea() {
		return PI*this.radio*this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id=" + id + ", area=" + this.calculaarea() + "]";
	}
	
}
