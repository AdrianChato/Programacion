package simulacroexamen2;

public class Nadador extends Deportistas implements ICompeticion{

	public Nadador(String nombre, String pais, int edad, double peso, double altura) {
		super(nombre, pais, edad, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void competir() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTiempocalentamiento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCaloriasNecesariasDias() {
		// TODO Auto-generated method stub
		return 0;
	}

}
