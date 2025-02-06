package Orientacionaobjetos;

public class Gestionapokemon {

	public static void main(String[] args) {
		Pokemon pikachu  = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo="Electrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewto";
		mew2.nivel = 20;
		mew2.tipo = "Psíquico";
		
		
		String cadenaPikachu = pikachu.convierteencadena();
		System.out.println(cadenaPikachu);
		String cadenaM = mew2.convierteencadena();
		System.out.println(cadenaM);
		
		boolean gana = pikachu.figth(mew2);
		
		cadenaPikachu = pikachu.convierteencadena();
		System.out.println(cadenaPikachu);
		cadenaM = mew2.convierteencadena();
		System.out.println(cadenaM);

	}
}
