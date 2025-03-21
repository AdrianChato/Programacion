package simulacroexamen3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pilotos implements IVuelo{

	private String nombre;
	private String nacionalidad;
	private int edad;
	private int numlicencia;
	private int horasvuelo;
	private Vuelo [] vueloasignado;
	
	public Pilotos(String nombre, String nacionalidad, int edad, int numlicencia) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numlicencia = numlicencia;
		this.horasvuelo = horasvuelo;
		this.vueloasignado = vueloasignado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumlicencia() {
		return numlicencia;
	}

	public void setNumlicencia(int numlicencia) {
		this.numlicencia = numlicencia;
	}

	public int getHorasvuelo() {
		return horasvuelo;
	}

	public void setHorasvuelo(int horasvuelo) {
		this.horasvuelo = horasvuelo;
	}

	public Vuelo[] getVueloasignado() {
		return vueloasignado;
	}

	public void setVueloasignado(Vuelo[] vueloasignado) {
		this.vueloasignado = vueloasignado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(vueloasignado);
		result = prime * result + Objects.hash(edad, horasvuelo, nacionalidad, nombre, numlicencia);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilotos other = (Pilotos) obj;
		return numlicencia == other.numlicencia;
	}
	
	public void agregarvuelo(Vuelo v) throws VueloException{
		if (this.existevuelo(v)) {
			throw new VueloException();
		}
	}
	
	public boolean existevuelo(Vuelo v) {
		boolean existe = false;
		
	}
}
