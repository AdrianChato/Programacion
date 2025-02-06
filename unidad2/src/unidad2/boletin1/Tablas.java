package unidad2.boletin1;

public class Tablas {

	public static void main(String[] args) {
		String diassemana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		for (int pos = 0; pos<diassemana.length; pos++) {
			System.out.println(diassemana[pos]);
		
		if (pos<5) {
			System.out.println("laborables" +diassemana[pos]) ;
		}
		else {
			System.out.println("Festivo" + diassemana[pos]);
		}
	}
		for (int pos = 0; pos<diassemana.length; pos++) {
			System.out.println(diassemana[pos]);
		
		while (pos<diassemana.length) {
		if (pos < 5) {
			System.out.println("laborables" +diassemana[pos]) ;
		}
			else {
			System.out.println("Festivo" + diassemana[pos]);
		}
		pos = pos +1;
		}
		}
	}
}