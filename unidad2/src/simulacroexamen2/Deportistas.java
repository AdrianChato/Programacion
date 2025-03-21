package simulacroexamen2;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Deportistas implements ICompeticion {

	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba[] listapruebas;

	public Deportistas(String nombre, String pais, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.listapruebas = new Prueba[50];
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
	
	//public int getHorasEntrenamiento (LocalDate fecha) {
		int numdiasentre;
		
		//return numdiasentre;
	//}
	
	public Prueba getpruebamascercana() {
		Prueba p =listapruebas[0];
		for (int i =0; i<listapruebas.length; i++) {
			if (p != null && listapruebas[i]!= null && listapruebas[i].equals(EstadoPrueba.PLANIFICADA)) {
				int diasMinimo= p.getFecha().compareTo(LocalDate.now());
				Prueba itero= listapruebas[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMinimo > diasItero) {
					p = itero;
				}
			}
		}
		return p;
	}

	@Override
	public String toString() {
		return "Deportistas [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", listapruebas=" + Arrays.toString(listapruebas) + ", numdiasentre=" + numdiasentre + "]";
	}
	
	
}
