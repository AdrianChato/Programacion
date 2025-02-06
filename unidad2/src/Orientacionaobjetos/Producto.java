package Orientacionaobjetos;

public class Producto {

	String nombre;
	int numUnidades;
	float precioVenta;
	
	String pasoAcadena() {
		String cadena = "Alumno" + nombre + " DNI:" +numUnidades + " nota:" +precioVenta;
		return cadena;
	}
	
	boolean pedirStock() {
		boolean pedir = false;
		if (numUnidades < 3) {
			pedir = true;
		}
		else {
			pedir = false;
		}
		return pedir;
	}
	int aumentounidades(int aumento) {
		int unidaumentada = numUnidades+aumento;
		
		return unidaumentada;
	}
}
