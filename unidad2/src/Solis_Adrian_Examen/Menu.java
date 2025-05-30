package Solis_Adrian_Examen;

import java.util.Objects;

public class Menu {
	
	private int identificador;
	private String nombre;
	private int consumocal;
	private double precioventa;
	private double preciocoste;
	private dieta tipodieta;
	
	public Menu(int identificador, String nombre, int consumocal, double precioventa, double preciocoste,
			dieta tipodieta) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.consumocal = consumocal;
		this.precioventa = precioventa;
		this.preciocoste = preciocoste;
		this.tipodieta = tipodieta;
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getConsumocal() {
		return consumocal;
	}

	protected void setConsumocal(int consumocal) {
		this.consumocal = consumocal;
		if (consumocal <1000) {
			System.out.println("Es una dieta baja en calorias ");
		}
	}

	protected double getPrecioventa() {
		return precioventa;
	}

	protected void setPrecioventa(double precioventa) {
		this.precioventa = preciocoste+(preciocoste*0.3);
	}

	protected double getPreciocoste() {
		return preciocoste;
	}

	protected void setPreciocoste(double preciocoste) {
		this.preciocoste = preciocoste ;
	}

	protected dieta getTipodieta() {
		return tipodieta;
	}

	protected void setTipodieta(dieta tipodieta) {
		this.tipodieta = tipodieta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consumocal, identificador, nombre, preciocoste, precioventa, tipodieta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return consumocal == other.consumocal && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(preciocoste) == Double.doubleToLongBits(other.preciocoste)
				&& Double.doubleToLongBits(precioventa) == Double.doubleToLongBits(other.precioventa)
				&& tipodieta == other.tipodieta;
	}

	
	
	@Override
	public String toString() {
		return "Menu [nombre=" + nombre + ", precioventa=" + precioventa + ", tipodieta=" + tipodieta + "]";
	}

	protected boolean tienecarne () {
		boolean carne;
		if (dieta.VEGANO || dieta.VEGETARIANO) {
			carne = true;
		}
		else {
			carne = false;
		}
		return carne;
	}
	

}
enum dieta {
	VEGETARIANO,VEGANO,SIN_GLUTEN,SIN_LACTOSA
}