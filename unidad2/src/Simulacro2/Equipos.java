package Simulacro2;

import java.util.Objects;

public class Equipos {

	private String nombre;
	private String mac;
	private String sistemaoperativo;
	private int numIncidentes = 0;
	
	public Equipos(String nombre, String mac, String sistemaoperativo, int numIncidentes) {
		super();
		this.nombre = nombre;
		this.mac = mac;
		this.sistemaoperativo = sistemaoperativo;
		this.numIncidentes = numIncidentes;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		this.mac = mac;
	}

	protected String getSistemaoperativo() {
		return sistemaoperativo;
	}

	protected void setSistemaoperativo(String sistemaoperativo) {
		this.sistemaoperativo = sistemaoperativo;
	}

	protected int getNumIncidentes() {
		return numIncidentes;
	}

	protected void setNumIncidentes(int numIncidentes) {
		this.numIncidentes = numIncidentes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mac, nombre, numIncidentes, sistemaoperativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipos other = (Equipos) obj;
		return mac == other.mac;
	}

	@Override
	public String toString() {
		return "Equipos [nombre=" + nombre + ", mac=" + mac + ", numIncidentes=" + numIncidentes + "]";
	}
	
	
}
