package Orientacionaobjetos;

public class Alumnos {
	String nombre;
	String DNI;
	float nota;

	String pasoAcadena() {
		String cadena = "Alumno" + nombre + " DNI:" +DNI + " nota:" +nota;
		return cadena;
	}
	boolean aprobado() {
		boolean aprueba = true;
		if (nota >= 5) {
			aprueba = true;
		}
		else {
			aprueba = false;
		}
		return aprueba;
	}
	}

