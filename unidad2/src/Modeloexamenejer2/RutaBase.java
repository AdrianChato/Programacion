package Modeloexamenejer2;

import java.util.Objects;

public abstract class RutaBase implements IRuta {

	private int id;
	private String ciudadorigen;
	private String ciudaddestino;
	private int distancia;

	public RutaBase(int id, String ciudadorigen, String ciudaddestino, int distancia) {
		super();
		this.id = id;
		this.ciudadorigen = ciudadorigen;
		this.ciudaddestino = ciudaddestino;
		this.distancia = distancia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudadorigen() {
		return ciudadorigen;
	}

	public void setCiudadorigen(String ciudadorigen) {
		this.ciudadorigen = ciudadorigen;
	}

	public String getCiudaddestino() {
		return ciudaddestino;
	}

	public void setCiudaddestino(String ciudaddestino) {
		this.ciudaddestino = ciudaddestino;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudaddestino, ciudadorigen, distancia, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}

	
}
