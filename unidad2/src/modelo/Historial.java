package modelo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Historial {

	private Set <PaginaWeb> chivato;

	public Historial(Set<PaginaWeb> chivato) {
		super();
		this.chivato = new TreeSet<PaginaWeb>();
	}

	public Set<PaginaWeb> getChivato() {
		return chivato;
	}

	public void setChivato(Set<PaginaWeb> chivato) {
		this.chivato = chivato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chivato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historial other = (Historial) obj;
		return Objects.equals(chivato, other.chivato);
	}
	
	
}
