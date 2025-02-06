package boletin3;

public class GestionaVehiculos {

	public static void main(String[] args) {
		Vehiculo coche = new Vehiculo("Renault","Clio", 2015, "gasolina", 50,50,6.1F);
		Vehiculo coche2 = new Vehiculo("Peugeot","207",2008,"diesel",47,15.5F,5.3F);
		
		
		System.out.println(coche2);
		float consumocoche2 = coche2.calcularconsumo(50);
		System.out.println(consumocoche2);
		boolean echalegasofa = coche2.esnecesariorepostar();
		System.out.println(echalegasofa);
		
		System.out.println(coche);
		float consumocoche = coche.calcularconsumo(25);
		System.out.println(consumocoche);
		boolean echarcombustible = coche.esnecesariorepostar();
		System.out.println(echarcombustible);
		
	}

}