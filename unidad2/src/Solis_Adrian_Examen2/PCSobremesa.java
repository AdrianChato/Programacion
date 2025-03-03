package Solis_Adrian_Examen2;

public class PCSobremesa extends Computadora{
	private boolean tieneGpuintegrada;

	public PCSobremesa(String marca, String modelo, double precio, int capacidadram, boolean tieneGpuintegrada) {
		super(marca, modelo, precio, capacidadram);
		this.tieneGpuintegrada = tieneGpuintegrada;
	}

	protected boolean isTieneGpuintegrada() {
		return tieneGpuintegrada;
	}

	protected void setTieneGpuintegrada(boolean tieneGpuintegrada) {
		this.tieneGpuintegrada = tieneGpuintegrada;
	}
	
	

}
