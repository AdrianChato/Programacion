package Solis_Adrian_Examen2;

import java.util.Objects;

public class Dispositivo {

	private String marca;
	private String modelo;
	private double precio;
	
	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
		if (precio <0) {
			System.out.println("Error: ");
			precio = 1;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	public double calcularpreciodescuento() {
		double preciodescuento;
		preciodescuento = getPrecio()-(getPrecio()*0.1);
		return preciodescuento;
	}

	@Override
	public String toString() {
		return "Dispositivo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
}
