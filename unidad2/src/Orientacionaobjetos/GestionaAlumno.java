package Orientacionaobjetos;

public class GestionaAlumno {

	public static void main(String[] args) {
		Alumnos alum1  = new Alumnos();
		alum1.nombre = "Pikachu";
		alum1.DNI = "12234589Z";
		alum1.nota= 5;
		
		Alumnos alum2 = new Alumnos();
		alum2.nombre = "Mewto";
		alum2.DNI = "17834589Z";
		alum2.nota = 4;

		String cadenaalum1 = alum1.pasoAcadena();
		System.out.println(cadenaalum1);
		String cadenaalum2 = alum2.pasoAcadena();
		System.out.println(cadenaalum2);
		
		boolean aprobado = alum1.aprobado(); 
		
		cadenaalum1 = alum1.pasoAcadena();
		System.out.println(cadenaalum1);
		cadenaalum2 = alum2.pasoAcadena();
		System.out.println(cadenaalum2);
	}

}
