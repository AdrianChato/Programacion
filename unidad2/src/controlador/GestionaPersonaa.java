package controlador;

import modelo.Estudiante;
import modelo.IAccion;
import modelo.PersonaRefactoriza;
import modelo.*;

public class GestionaPersonaa {

	public static void main(String[] args) {
		PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos pepi");
		IAccion [] acciones = carlos.getAcciones();
		acciones [0] = new Estudiante();
		System.out.println(carlos);
		
		
		PersonaRefactoriza cristina = new PersonaRefactoriza("CRistina");
		acciones = cristina.getAcciones();
		acciones[0] = new Estudiante();
		acciones[1] = new Empleado();
		System.out.println(cristina);
	}

}
