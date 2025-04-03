package modelo;

import java.util.Objects;

public class Contacto {
	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private String telefono;

	public Contacto(String nombre, String apellidos, String email, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, direccion, email, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}



	@Override
	public String toString() {
		return nombre + " " + apellidos + " - " + telefono + " - " + email;
	}

}
