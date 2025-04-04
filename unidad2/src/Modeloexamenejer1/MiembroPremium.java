package Modeloexamenejer1;

public class MiembroPremium extends MiembroBase{

	private int maxAmigos;
	private TipoPremium tipos;
	
	public MiembroPremium(String email, String nombre,TipoPremium tipos) {
		super( email, nombre);
		this.maxAmigos = 3;
		this.tipos = tipos;
	}

	@Override
	public String getTipoUsuario() {
		String cadena = "Premium " + this.tipos;
		return cadena;
	}

	@Override
	public String toString() {
		return "MiembroPremium [getTipoUsuario()=" + getTipoUsuario() + ", getId()=" + getId() + ", getEmail()="
				+ getEmail() + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
	
}
