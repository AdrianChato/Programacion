package Solis_Adrian_Examen;

import java.time.LocalDate;
import java.util.Objects;

public class Clientes {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private Menu dietaasignada;
	private LocalDate fechainscripcion;
	private boolean clientevip;
	
	public Clientes(String dni, String nombre, String apellidos, int edad, Menu dietaasignada,
			LocalDate fechainscripcion, boolean clientevip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dietaasignada = dietaasignada;
		this.fechainscripcion = fechainscripcion;
		this.clientevip = clientevip;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected Menu getDietaasignada() {
		return dietaasignada;
	}

	protected void setDietaasignada(Menu dietaasignada) {
		this.dietaasignada = dietaasignada;
	}

	protected LocalDate getFechainscripcion() {
		return fechainscripcion;
	}

	protected void setFechainscripcion(LocalDate fechainscripcion) {
		this.fechainscripcion = fechainscripcion;
	}

	protected boolean isClientevip() {
		return clientevip;
	}

	protected void setClientevip(boolean clientevip) {
		this.clientevip = hayQuehacerpromocion();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, clientevip, dietaasignada, dni, edad, fechainscripcion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(dni, other.dni)
				&& edad == 0;
	}

	
	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", hayQuehacerpromocion()=" + hayQuehacerpromocion()
				+ ", calculapreciomenuconpromocion()=" + calculapreciomenuconpromocion() + "]";
	}

	private boolean hayQuehacerpromocion () {
		boolean promocion = true;
		if (this.getEdad()<65) {
			promocion = false;
			System.out.println("NO tiene promocion");
		} else {
			promocion = true;
			System.out.println("SI tiene promocion");
		}
		return promocion;
	}
	
	double calculapreciomenuconpromocion () {
		double precio = 0;
		if (hayQuehacerpromocion() == true) {
			if (precio <10) {
				precio = precio-1;
			}
			else if (precio >=10) {
				precio = precio - (precio*0.1);
			}
		}
		return precio;
	}
}
