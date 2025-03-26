package Modeloexamenejer1;

public class MiembroEstandar extends MiembroBase{

	private int maxAmigos;

	public MiembroEstandar(String email, String nombre) {
		super(email, nombre);
		this.maxAmigos = 2;
	}

	@Override
	public String getTipoUsuario() {
		return "Estandar";
	}

	@Override
	public String toString() {
		return "MiembroEstandar [getTipoUsuario()=" + getTipoUsuario() + ", getId()=" + getId() + ", getEmail()="
				+ getEmail() + ", getNombre()=" + getNombre() + "]";
	}

	
	
}
