package boletin4;

public class CocheElectrico extends Automovil {

	private String tipoBateria;

	public CocheElectrico(String dueno, int numPuertas, int numRuedas, String calificacionEcologica,
			String tipoBateria) {
		super(dueno, numPuertas, numRuedas, calificacionEcologica);
		this.tipoBateria = tipoBateria;
	}

	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	
	
}
