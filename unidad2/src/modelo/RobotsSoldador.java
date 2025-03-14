package modelo;

public class RobotsSoldador extends Robots {

	private int temperatura;
	private String especificacion;

	public RobotsSoldador(int id, String modelo, int bateria, String combustible, String descripcion,
			Estado estadorobots, String nombre, int temperatura, String especificacion) {
		super(modelo, bateria, combustible, descripcion, estadorobots, nombre);
		this.temperatura = temperatura;
		this.especificacion = especificacion;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	@Override
	public String ejecutartarea() {
		String tarea = "Soldaduras precisas de carroceria de automovil";
		return tarea;
	}

	@Override
	public boolean recargar() {
		if (getEstadorobots().equals(Estado.APGADO)) {
			System.out.println("Recargando por " + this.getCombustible());
		return true;
	} else {
		System.out.println("Estoy encendido no puedo recargar");
		return false;
	}

	}
}
