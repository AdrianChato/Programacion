package Solis_Adrian_Examen2;

public class GestionDispositivos {

	public static void main(String[] args) {
		
		Telefono e1 = new Smartphone("Samsung", "Galaxy", 800, false, 2);
		Computadora e2 = new Laptop("HP", "XXX", 1000, 32, 2.1);
		Computadora e3 = new PCSobremesa("NVIDIA", "CJSD", 2000, 64, false);
		
		Dispositivo e4 = new Smartphone("Samsung", "Galaxy", 800, false, 2);
		Dispositivo e5 = new Laptop("HP", "XXX", 1000, 32, 2.1);
		Dispositivo e6 = new PCSobremesa("NVIDIA", "CJSD", 2000, 64, false);
		
		
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(e6.toString());
		
		System.out.println(e1.equals(e6));
		System.out.println(e1.equals(e4));
		
		if (e4 instanceof (Telefono)) {
			Telefono e7 = (telefono) e4;
		}
		
		Telefono e7 = (Telefono)e4;
		Computadora e8 = (Computadora)e5;
		Computadora e9 = (Computadora)e6;
	}

}
