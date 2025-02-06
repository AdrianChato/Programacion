package boletin2;

public class Alumno {

	String nombre;
	String apellidos;
	String email;
	NotaAsignatura notaProg;
	NotaAsignatura notaBase;
	
	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", notaProg=" + notaProg
				+ ", notaBase=" + notaBase + "]";
	}
	
	void imprimesiaaprobado(String nombreA) {
		NotaAsignatura notaasig = this.notaProg;
		if (nombreA.equals("programacion")) {
			notaasig = this.notaProg;
		}
		else {
			notaasig = this.notaBase;
		}
		if (notaasig.calculaMedia() >= 5) {
			System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + nombreA);
		}
		else {
			System.out.println("El alumno " + nombre + " no ha aprobado la asignatura " + nombreA);
		}
	}
	}
