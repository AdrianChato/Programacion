package herencia;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{

	private LocalDate fechafincontrato;

	public ProfesorInterino(String nombre, String apellidos, String dni, String departamento,
			LocalDate fechafincontrato) {
		super(nombre, apellidos, dni, departamento);
		this.fechafincontrato = fechafincontrato;
	}

	protected LocalDate getFechafincontrato() {
		return fechafincontrato;
	}

	protected void setFechafincontrato(LocalDate fechafincontrato) {
		this.fechafincontrato = fechafincontrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechafincontrato=" + fechafincontrato + ", getDepartamento()=" + getDepartamento()
				+ ", getNombre()=" + getNombre() + "]";
	}
	
	
}
