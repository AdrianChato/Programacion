package boletin3;

import java.util.Arrays;

public class Equipo {

	String nombreEquipo;
	int [] puntuaciones;
	Persona [] personas;
	
	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", personas=" + Arrays.toString(personas) + "]";
	}
	
	float calculamediaedad() {
		float mediaedad= 0f;
		float edades = 0;
		Persona [] tablapersonas = this.personas;
		for (Persona p: tablapersonas ) {
			edades = edades+p.edad;
		}
		mediaedad = edades/tablapersonas.length;
		return mediaedad;
	}
	
}
