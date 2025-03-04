package modelo;

public class Circunferencia extends Figura{

	private double radio;
	

	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}



	@Override
	public double calcularArea() {
		return 3.14*(radio*radio);
	}

	
}
