package modelo;

public class RobotsPintor extends Robots{
	

	public RobotsPintor(int id, String modelo, int bateria, String combustible, String descripcion, Estado estadorobots,
			String nombre) {
		super(modelo, bateria, combustible, descripcion, estadorobots, nombre);
	}

	@Override
	public String ejecutartarea() {
	String tarea = "Aplicando pinturas";
	return tarea;
		}

	@Override
	public boolean recargar() {
		System.out.println("Recargando por electricidad");
		return true;
	}

	
}
