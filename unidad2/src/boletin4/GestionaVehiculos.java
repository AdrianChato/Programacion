package boletin4;

public class GestionaVehiculos {

	public static void main(String[] args) {
		
		Automovil c1 = new Automovil("Pepe",5,5,"A");
		Vehiculo c2 = new Automovil ("Pepa", 3,4,"Eco");
		
		boolean esVehiculo = c2 instanceof Vehiculo;
		System.out.println("ES vehiculo?:" +esVehiculo);
		
		boolean esAutomovil = c1 instanceof Automovil;
		System.out.println("Es coche?: " +esAutomovil);
		
		System.out.println("Es camion?: " +(c2 instanceof Camion));
		//System.out.println("Es camion?: " +(c1 instanceof Camion)); Un coche no puede ser un camion
		
	}

}
