package SolisSimulacionEmpleados;

public class Gestionaempleados {

	public static void main(String[] args) {
		
		Administrativo Carlos = new Administrativo("Carlos", "12345678A", 1200, 40);
		Directivo Juan = new Directivo("Juan", "87654321B", 2800, 15);
		
		System.out.println(Carlos.toString());
		System.out.println(Juan.toString());

	}

}
