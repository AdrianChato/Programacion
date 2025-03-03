package Solis_Adrian_Examen2;

public class Smartphone extends Telefono{

	private int cantidadCamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tienetecladofisico, int cantidadCamaras) {
		super(marca, modelo, precio, tienetecladofisico);
		this.cantidadCamaras = cantidadCamaras;
	}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}
	
	public double calcularpreciodescuento() {
		double descuento = getPrecio() -(getPrecio()*0.15);
		return descuento;
	}
}
