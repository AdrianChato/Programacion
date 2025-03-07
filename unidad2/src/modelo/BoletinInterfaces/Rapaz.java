package modelo.BoletinInterfaces;

public class Rapaz extends Animal{
	
	public Rapaz(String nombreespecie, String dondehabita, Familia tipofamilia, Animal[] animalcome,
			Animal[] animalcomido) {
		super(nombreespecie, dondehabita, tipofamilia, animalcome, animalcomido);
	}
	
	@Override
	boolean atacar(Animal a) {
		if (a instanceof Serpiente || a instanceof Roedor) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	boolean huir(Animal a) {
		if (a instanceof Leon) {
			return true;
		} else {
			return false;
		}
	}
	
}
