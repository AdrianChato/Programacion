package modelo.BoletinInterfaces;

public class Leon extends Animal{

	public Leon(String nombreespecie, String dondehabita, Familia tipofamilia, Animal[] animalcome,
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
