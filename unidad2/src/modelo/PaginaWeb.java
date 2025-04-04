package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb  implements Comparable<PaginaWeb>{

	private String url;
	private LocalDate fecha;

	public PaginaWeb(String url, LocalDate fecha) {
		super();
		this.url = url;
		this.fecha = fecha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fecha, other.fecha);
	}

	@Override
	public int compareTo(PaginaWeb o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
