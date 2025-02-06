package boletin2;

public class GestionaAlumno {

	public static void main(String[] args) {
		NotaAsignatura notabaseLucia = new NotaAsignatura ("Base", 6,7,8);
		NotaAsignatura notaprogLucia = new NotaAsignatura ("programacion", 9,4,7);
		Alumno lucia = new Alumno("lucia", "lucia@gmail.com");
		lucia.notaBase = notabaseLucia;
		lucia.notaProg = notaprogLucia;
		System.out.println(lucia);
		lucia.imprimesiaaprobado("programacion");
		
		NotaAsignatura notabaseandres = new NotaAsignatura ("Base", 4,4,6);
		NotaAsignatura notaprogandres = new NotaAsignatura ("programacion", 9,8,8);
		Alumno andres = new Alumno("andres", "andres@gmail.com");
		lucia.notaBase = notabaseandres;
		lucia.notaProg = notaprogandres;
		System.out.println(andres);
		andres.imprimesiaaprobado("Base");
	}

}
