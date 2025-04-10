package models;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import exceptions.GuarderiaException;

public class Actividad {
    private String nombre;
    private Lugar lugar;
    private LocalDate fecha;
    private int edadRecomendada;
    private int maxAlumnos;
    private Maestro maestro;

    private Collection <Alumno> alumnos; //TODO Decide qué estructura de datos

    public Actividad(String nombre, Lugar lugar, int edadRecomendada, int maxAlumnos,  Maestro maestro, LocalDate fecha) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.edadRecomendada = edadRecomendada;
        this.maxAlumnos = maxAlumnos;
        this.maestro = maestro;
        this.alumnos = new HashSet<Alumno>();
       // this.alumnos = new H
    }

    public boolean agregarAlumno(Alumno alumno) throws GuarderiaException{
       boolean agregado = false;
       //TODO
       
       if(alumnos.size() >= maxAlumnos) {
    	   agregado = false;
    	   throw new GuarderiaException("Máximo alumnos, no caben más");
       }
       else if(alumno.getEdad() < edadRecomendada) {
    	   agregado = false;
    	   throw new GuarderiaException("El alumno no tiene la edad recomendada para la actividad");
       }
       else {
    	   alumnos.add(alumno);
    	   agregado = true;
       }
       
       return agregado;
    }
    
    public List<Alumno> getAlumnadoConAlergias()
    {
    	List<Alumno> alumnadoAlergia= null;
    	
    	return alumnadoAlergia;
    }
    
    public boolean participaAlumnoEnActividad(Alumno a)
    {
    	boolean participa = false;
    	
    	if(alumnos.contains(a)) {
    		participa = true;
    	}
    	
    	//TODO
    	return participa;
    }
    


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public int getMaxAlumnos() {
		return maxAlumnos;
	}

	public void setMaxAlumnos(int maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actividad other = (Actividad) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}

























