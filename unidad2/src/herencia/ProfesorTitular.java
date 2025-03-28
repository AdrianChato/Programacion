package herencia;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{

	private LocalDate fechaAdjudicacionPlaza;

	public ProfesorTitular(String nombre, String apellidos, String dni, String departamento,
			LocalDate fechaAdjudicacionPlaza) {
		super(nombre, apellidos, dni, departamento);
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	public LocalDate getFechaAdjudicacionPlaza() {
		return fechaAdjudicacionPlaza;
	}

	public void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", getDepartamento()="
				+ getDepartamento() + ", getNombre()=" + getNombre() + "]";
	}
	
	
}
