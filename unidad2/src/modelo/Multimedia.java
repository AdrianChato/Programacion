package modelo;

public abstract class Multimedia extends Recursos{

	private String nombre;
	private String generoliterario;
	private int diasprestamos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGeneroliterario() {
		return generoliterario;
	}
	public void setGeneroliterario(String generoliterario) {
		this.generoliterario = generoliterario;
	}
	public int getDiasprestamos() {
		return diasprestamos;
	}
	public void setDiasprestamos(int diasprestamos) {
		this.diasprestamos = diasprestamos;
	}
	public Multimedia(int id, String ubicacion, String nombre, String generoliterario) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.generoliterario = generoliterario;
		this.diasprestamos = 10;
	}
	
	@Override
	public int getDevuelveDiasPrestamo() {
		return diasprestamos;
	}
	
	
	
}
