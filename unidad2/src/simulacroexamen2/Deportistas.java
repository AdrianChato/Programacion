package simulacroexamen2;

public abstract class Deportistas implements ICompeticion {

	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba[] listapruebas = new Prueba[50];

	public Deportistas(String nombre, String pais, int edad, double peso, double altura, Prueba[] listapruebas) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.listapruebas = listapruebas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Prueba[] getListapruebas() {
		return listapruebas;
	}

	public void setListapruebas(Prueba[] listapruebas) {
		this.listapruebas = listapruebas;
	}

	public abstract int getTiempocalentamiento();
	public abstract int getCaloriasNecesariasDias();
	
	
}
