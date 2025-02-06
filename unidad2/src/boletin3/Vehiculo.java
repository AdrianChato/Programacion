package boletin3;

public class Vehiculo {

	String marca;
	String modelo;
	int anyo_fabricacion;
	String tipocombustible;
	float capacidadtotaltanque;
	float cantidadcombactual;
	float consumomedio100km;
	
	



	public Vehiculo(String marca, String modelo, int anyo_fabricacion, String tipocombustible,
			float capacidadtotaltanque, float cantidadcombactual, float consumomedio100km) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo_fabricacion = anyo_fabricacion;
		this.tipocombustible = tipocombustible;
		this.capacidadtotaltanque = capacidadtotaltanque;
		this.cantidadcombactual = cantidadcombactual;
		this.consumomedio100km = consumomedio100km;
	}

	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anyo_fabricacion=" + anyo_fabricacion
				+ ", tipocombustible=" + tipocombustible + ", capacidadtotaltanque=" + capacidadtotaltanque
				+ ", cantidadcombactual=" + cantidadcombactual + ", consumomedio100km=" + consumomedio100km + "]";
	}



	float calcularconsumo(float kmrecorridos){
		float consumo;
		consumo = (kmrecorridos*consumomedio100km)/100;
		return consumo;
		
	}
	
	boolean esnecesariorepostar () {
		boolean repostaje = false;
		if (cantidadcombactual >= (capacidadtotaltanque*0.2)) {
			repostaje = false;
		} else {
			repostaje = true;
		}
		return repostaje;
	}

}
