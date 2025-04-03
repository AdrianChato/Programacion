package modelo;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Historial {

	private Set <PaginaWeb> chivato;

	public Historial(Set<PaginaWeb> chivato) {
		super();
		this.chivato = new TreeSet<PaginaWeb>();
	}
	
	
}
