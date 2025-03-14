package herencia;

import java.time.LocalDate;

public class GestionaProfesores {

	public static void main(String[] args) {
		ProfesorInterino interino1 = new ProfesorInterino("Pepe","Garcia","3245626745A","Ingles",LocalDate.now().plusMonths(6));
		Profesor interino2 = new ProfesorInterino("Pepa","Rodriguez","3245698645A","Mates",LocalDate.now().plusMonths(4));
		
		System.out.println(interino1.getFechafincontrato());
		ProfesorInterino p3 = (ProfesorInterino)interino2; //Down Casting de padre a hijo
		System.out.println(p3.getFechafincontrato());
		
		ProfesorTitular titular1 = new ProfesorTitular("Antonio","Perez","321233745A","NAda",LocalDate.now().minusYears(1));
		Profesor titular2 = new ProfesorTitular("Antonia","Dandi","123233745A","nothing",LocalDate.now().minusYears(10));

		System.out.println(titular1.getFechaAdjudicacionPlaza());
		ProfesorTitular p2 = (ProfesorTitular) titular2;
		System.out.println(p2.getFechaAdjudicacionPlaza());
	}

}
