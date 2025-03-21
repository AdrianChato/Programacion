package simulacroexamen3;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {

	private int identificador;
	private String aerolinea;
	private String destino;
	private LocalDate fechavuelo;
	private int duracion;
	private EstadoVuelo estado;
	
	public Vuelo(int identificador, String aerolinea, String destino, LocalDate fechavuelo, int duracion,
			EstadoVuelo estado) {
		super();
		this.identificador = identificador;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechavuelo = fechavuelo;
		this.duracion = duracion;
		this.estado = estado;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechavuelo() {
		return fechavuelo;
	}

	public void setFechavuelo(LocalDate fechavuelo) {
		this.fechavuelo = fechavuelo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public EstadoVuelo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aerolinea, destino, duracion, estado, fechavuelo, identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return identificador == other.identificador;
	}
	
	
}
