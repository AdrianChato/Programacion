package Modeloexamenejer2;

public class RutaAerea extends RutaBase{

	private Valores tipovuelo;

	public RutaAerea(int id, String ciudadorigen, String ciudaddestino, int distancia, Valores tipovuelo) {
		super(id, ciudadorigen, ciudaddestino, distancia);
		this.tipovuelo = tipovuelo;
	}

	@Override
	public double getCoste() {
		double costekms = 0;
		switch (tipovuelo) {
		case LOW_COST:
			costekms = getDistancia() * 0.75;
			break;
		case NORMAL:
			costekms = getDistancia() * 1.1;
			break;
		case EXPRESS:
			costekms = getDistancia() * 1.5;
			break;
		}
		return costekms;
	}

	@Override
	public void getTipoRuta() {
		System.out.println("(Ruta aerea)" + this.tipovuelo);
	}
	
	
}
