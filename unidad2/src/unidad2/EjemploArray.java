package unidad2;

public class EjemploArray {

	public static void main(String[] args) {
		

	}

	boolean comparaTablas (int [] tabla1, int [] tabla2) {
		
		boolean iguales = true;
		if (tabla1.length != tabla2.length) {
			iguales = false;
		}
		else {
			for (int i = 0; i<tabla1.length; i++) {
				if (tabla1[i] == tabla2[i]) {
					iguales = true;
				}
				else {
					iguales = false;
				}
			}
		}
		return iguales;
	}
}
