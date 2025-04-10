package src.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import src.exceptions.GuarderiaException;
import src.models.*;
import src.models.Actividad;

public class RepositorioActividades {
	private Collection<Actividad> activididades;

	public RepositorioActividades() {
		super();
		this.activididades = new HashSet<Actividad>();
		// Uso un HashSet porque no puedo tener repetidos ni me dice que guarde ordenado
	}

	public Collection<Actividad> getActivididades() {
		return activididades;
	}

	public void setActivididades(Set<Actividad> activididades) {
		this.activididades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		
		if (activididades.contains(a)) {
			esta = true;
		} 
		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		// TODO

	}

	public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) {
		List<Alumno> alergias = null;

		// TODO
		return alergias;
	}



	public List<Actividad> getListaActividades() {
		List<Actividad> actividades = null;

		// TODO
		return actividades;
	}

}
