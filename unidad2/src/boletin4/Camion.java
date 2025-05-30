package boletin4;

public class Camion extends Vehiculo {
    private int tonelajeKilos;
    private int numEjes;
    private int numPasajeros;

	public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numEjes, int numPasajeros) {
		super(dueno, numPuertas, numRuedas);
		this.tonelajeKilos = tonelajeKilos;
		this.numEjes = numEjes;
		this.numPasajeros = numPasajeros;
	}

	@Override
	public String toString() {
		return "Camion [tonelajeKilos=" + tonelajeKilos + ", numEjes=" + numEjes + ", numPasajeros=" + numPasajeros
				+ ", dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}

	public int getTonelajeKilos() {
		return tonelajeKilos;
	}

	public void setTonelajeKilos(int tonelajeKilos) {
		this.tonelajeKilos = tonelajeKilos;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

}