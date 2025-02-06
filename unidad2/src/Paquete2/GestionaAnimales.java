package Paquete2;

public class GestionaAnimales {

	public static void main(String[] args) {
		Animal perro = new Animal();
		//perro.edad; no va, es private 
		perro.nombre = "lulu";
		perro.tipo = "Perro"; //no va, visibilidad normal y esta en otro paquete
		boolean anda = perro.caminar();
		
		Animal gato = new Animal();
		gato.nombre = "Baby";
		gato.tipo = "gato";
		System.out.println(anda);
		
		perro.Dardecomer();
		gato.Dardecomer();
		
		boolean mismoTipo = perro.sonDelMismoTipo(gato, 23);
		System.out.println(mismoTipo);
	}

}
