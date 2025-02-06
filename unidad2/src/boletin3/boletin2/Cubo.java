package boletin2;

public class Cubo {

	int lado;
	float litroscontiene;
	float capacidadmax;
	//calculaarea: float
	//calculavolumen: float 
	//vaciar (float litroAsacar) : boolean
	//rellenar (float litroameter) : boolean 
	public Cubo(int lado, float litroscontiene) {
		super();
		this.lado = lado;
		this.litroscontiene = litroscontiene;
		this.capacidadmax = calculavolumen();
		
		
	}
	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", litroscontiene=" + litroscontiene + ", capacidadmax=" + capacidadmax + "]";
	}
	
	float calculararea() {
	float area = 6*lado*lado;
	return area;
	}
	float calculavolumen() {
		float volumen = lado*lado*lado;
		return volumen;
	}
	/*}
	boolean vaciar(float litroAsacar) {
		
	}
	boolean rellenar (float litroAmeter) {
		
	}
	
	
}*/
}