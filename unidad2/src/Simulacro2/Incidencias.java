package Simulacro2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencias {

	private int identificador;
	private String nombre;
	private String descripcion;
	private LocalDate fecharegistro;
	private LocalDate fechacierre;
	
	public Incidencias(int identificador, String nombre, String descripcion, LocalDate fecharegistro,
			LocalDate fechacierre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecharegistro = fecharegistro;
		this.fechacierre = fechacierre;
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

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFecharegistro() {
		return fecharegistro;
	}

	protected void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	protected LocalDate getFechacierre() {
		return fechacierre;
	}

	protected void setFechacierre(LocalDate fechacierre) {
		if (Estado.CERRADA == null) {
			System.out.println("Fecha de cierre es nula ");
			fechacierre = null;
		}
		else {
			fechacierre=this.fechacierre;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, fechacierre, fecharegistro, identificador, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencias other = (Incidencias) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(fechacierre, other.fechacierre)
				&& Objects.equals(fecharegistro, other.fecharegistro) && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Incidencias [nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fecharegistro=" + fecharegistro + "]";
	}
	
	
	public void esUrgente() {
		LocalDate Hoy = LocalDate.now();
		if (Criticidad.CRITICA != null) {
			System.out.println("Es urgente ");
		}
		else if (Criticidad.GRAVE != null && fechacierre.plusDays(7).isAfter(Hoy)) {
			System.out.println("Es urgente ");
		}
		else if (Criticidad.MEDIA != null && fechacierre.plusDays(30).isAfter(Hoy)) {
			System.out.println("Es urgente ");
	}
	
}
enum Estado {
	REGISTRADA,ANALIZADA,RESOLUCIÓN, CERRADA;
}
enum Criticidad {
	CRITICA, GRAVE, MEDIA, LEVE;
}
}