package modelo;

import modelo.Robots.Estado;

public class RobotsEnsamblador extends Robots{
	

	public RobotsEnsamblador(int id, String modelo, int bateria, String combustible, String descripcion,
			Estado estadorobots, String nombre) {
		super(modelo, bateria, combustible, descripcion, estadorobots, nombre);
	}

	@Override
	public String ejecutartarea() {
	String tarea = "ensamblar piezas";	
	return tarea;
	}

	@Override
	public boolean recargar() {
		if (getEstadorobots().equals(Estado.APGADO)) {
			System.out.println("Recargando por "+ this.getCombustible());
		return true;
	} else {
		System.out.println("Estoy encendido no puedo recargar");
		return false;
	}
	}

	
}
