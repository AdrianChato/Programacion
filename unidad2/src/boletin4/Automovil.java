package boletin4;

public class Automovil extends Vehiculo {
    private String calificacionEcologica;

	public Automovil(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }
    
	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}

	void imprimeResumen() {
    	this.toString();
    }
}