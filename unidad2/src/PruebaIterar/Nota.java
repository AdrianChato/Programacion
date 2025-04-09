package PruebaIterar;

import java.util.Objects;

public class Nota {

	private int nota;

	public Nota(int nota) {
		super();
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nota [nota=" + nota + "]";
	}
	
	
}
