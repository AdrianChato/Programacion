package Modeloexamenejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class MiembroBaseLista {
	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	private static int contadoridentificador;
	protected List<MiembroBaseLista> amigos = new ArrayList<MiembroBaseLista>();

	public MiembroBaseLista(String email, String nombre) {
		super();
		this.id = contadoridentificador + 1;
		this.email = email;
		this.nombre = nombre;
		contadoridentificador = contadoridentificador + 1;
		this.amigos = amigos;
	}

	public abstract String getTipoUsuario();

	

	@Override
	public int hashCode() {
		return Objects.hash(amigos, contadorAmigos, email, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBaseLista other = (MiembroBaseLista) obj;
		return Objects.equals(email, other.email) && id == other.id ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContadorAmigos() {
		return contadorAmigos;
	}

	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	public static int getContadoridentificador() {
		return contadoridentificador;
	}

	public static void setContadoridentificador(int contadoridentificador) {
		MiembroBaseLista.contadoridentificador = contadoridentificador;
	}

	public List<MiembroBaseLista> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<MiembroBaseLista> amigos) {
		this.amigos = amigos;
	}

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}

	public boolean isAmigo(MiembroBaseLista miembro) {
		return amigos.contains(miembro);
	}
	
	public void addMiembro (MiembroBaseLista miembro) throws GuzmanitosException{
		if (isAmigo(miembro)) {
				throw new GuzmanitosException("El miembro" + email+ "ya esta en la lista de amigos del miembro" + miembro);
			} else {
				amigos.add(miembro);
			}
		
	}

}
