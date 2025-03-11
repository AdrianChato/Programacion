package modelo.BoletinInterfaces;

import java.util.Arrays;

public abstract class Animal {

	private String nombreespecie;
	private String dondehabita;
	protected Familia tipofamilia;
	private Animal [] animalcome;
	private Animal [] animalcomido;
	
	public String getNombreespecie() {
		return nombreespecie;
	}
	public void setNombreespecie(String nombreespecie) {
		this.nombreespecie = nombreespecie;
	}
	public String getDondehabita() {
		return dondehabita;
	}
	public void setDondehabita(String dondehabita) {
		this.dondehabita = dondehabita;
	}
	public Familia getTipofamilia() {
		return tipofamilia;
	}
	public void setTipofamilia(Familia tipofamilia) {
		this.tipofamilia = tipofamilia;
	}
	public Animal[] getAnimalcome() {
		return animalcome;
	}
	public void setAnimalcome(Animal[] animalcome) {
		this.animalcome = animalcome;
	}
	public Animal[] getAnimalcomido() {
		return animalcomido;
	}
	public void setAnimalcomido(Animal[] animalcomido) {
		this.animalcomido = animalcomido;
	}
	
	public Animal(String nombreespecie, String dondehabita, Familia tipofamilia, Animal[] animalcome,
			Animal[] animalcomido) {
		super();
		this.nombreespecie = nombreespecie;
		this.dondehabita = dondehabita;
		this.tipofamilia = tipofamilia;
		this.animalcome = animalcome;
		this.animalcomido = animalcomido;
	}
	
	@Override
	public String toString() {
		return "Animal [nombreespecie=" + nombreespecie + ", dondehabita=" + dondehabita + ", tipofamilia="
				+ tipofamilia + ", animalcome=" + Arrays.toString(animalcome) + ", animalcomido="
				+ Arrays.toString(animalcomido) + "]";
	}
	
	abstract boolean atacar (Animal a);
	abstract boolean huir (Animal a);
	
	public enum Familia {
		RAPAZ,LEON,ROEDOR,SERPIENTE
	}
}
