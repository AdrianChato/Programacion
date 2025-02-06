package unidad2.boletin1;

public class Traza {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 3; i++) {
			System.out.println("Bucle externo, i=" +i);
			int j = 1;
					while (j <= i) {
						System.out.println("...Bucle interno, j=" +j);
						j++;
			
					}
		}

	}

}
