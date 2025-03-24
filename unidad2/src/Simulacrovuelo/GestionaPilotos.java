package Simulacrovuelo;


import java.time.LocalDate;


public class GestionaPilotos {

	public static void main(String[] args) throws Vueloexception {
		// TODO Auto-generated method stub

		Vuelo v1 = new Vuelo(1, "IBERIA", "Cancun", LocalDate.now(), 10, Estadovuelo.ENCURSO);
		
		Piloto c1 = new Comercial("Juan", "Española", 56, 333, 10);
		
		
		
	try {
		c1.agregarvuelo(v1);
	} catch (Vueloexception excepcion) {
		// TODO Auto-generated catch block
		System.out.println((excepcion.getMessage()));
		throw excepcion;
	}  
	System.out.println(c1.toString());
	
	}


}
