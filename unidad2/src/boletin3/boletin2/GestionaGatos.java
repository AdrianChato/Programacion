package boletin2;

public class GestionaGatos {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.color = "negro";
		gato1.raza = "Malinois";
		gato1.sexo = "hembra";
		gato1.edad = 11;
		gato1.peso = 34;
		
		Gato gato2 = new Gato();
		gato2.color = "azul";
		gato2.raza = "Pastor aleman";
		gato2.sexo = "hembra";
		gato2.edad = 4;
		gato2.peso = 37;
		
		Gato gato3 = new Gato();
		gato3.color = "marron";
		gato3.raza = "chiguagua";
		gato3.sexo = "macho";
		gato3.edad = 1;
		gato3.peso = 8;

		gato1.maullar();
		gato1.comer("pienso");
		
		gato2.ronronear();
		gato2.comer("pescado");
		
		gato1.pelear(gato2);
		gato1.pelear(gato3);
		
		System.out.println(gato1.toString());
	}

}
