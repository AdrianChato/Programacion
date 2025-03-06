package modelo.BoletinInterfaces;

public class Serpiente extends Animal{

	public Serpiente(String nombreespecie, String dondehabita, Familia tipofamilia, Animal[] animalcome,
			Animal[] animalcomido) {
		super(nombreespecie, dondehabita, tipofamilia, animalcome, animalcomido);
	}

	@Override
	boolean atacar(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean huir(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
