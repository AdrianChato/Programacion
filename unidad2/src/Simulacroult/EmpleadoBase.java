package Simulacroult;

public class EmpleadoBase extends Empleados{

	private Puesto funcion;

	
	public EmpleadoBase(String dni, String nombre, int sueldo, Puesto funcion) {
		super(dni, nombre, sueldo);
		this.funcion = funcion;
	}


	@Override
	public double devuelvesueldo() {
		double aumento = 0;
		switch (funcion) {
		case ADMINISTRATIVO: 
			aumento = (2.5/100) * 1150; 
			break;
		case CONTABLE:
			aumento = (2.5/100) * 1350;
			break;
		case OPERARIO:
			aumento = (2.5/100) * 1100;
			break;
		}
		return aumento + getSueldo();
	}
	
	
}
