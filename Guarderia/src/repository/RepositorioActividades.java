package repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exceptions.GuarderiaException;
import models.*;

public class RepositorioActividades {
	private Collection<Actividad> activididades;

	public RepositorioActividades() {
		super();
		this.activididades = new HashSet<Actividad>();
		//Uso un hashset porque no repetidos y no me dicen que guarde ordenado
	}

	public Collection<Actividad> getActivididades() {
		return activididades;
	}

	public void setActivididades(Set<Actividad> activididades) {
		this.activididades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		
		for (Actividad actividad : activididades) {
			if(actividad.getNombre().equals(nombreActividad) && actividad.getFecha().equals(fechaActividad) ) {
				actividad.participaAlumnoEnActividad(a);
				esta = true;
			}
		}

		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		
			for (Actividad actividad : activididades) {
				if(actividad.getNombre().equals(nombreActividad) && actividad.getFecha().equals(fechaActividad)) {
					actividad.agregarAlumno(a);
				}
			}
		
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
