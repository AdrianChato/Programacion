package simulacroexamen1;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler extends Vehiculo {

	private int id;
	private Vehiculo datos;
	private String carnet;
	private String dni;
	private int numDias;
	private EstadoCoche estado;

	public Alquiler(int identificador, Alquiler[] alquileres, boolean disponible, LocalDate fecharegistro, int id,
			Vehiculo datos, String carnet, String dni, int numDias, EstadoCoche estado) {
		super(identificador, alquileres, disponible, fecharegistro);
		this.id = id;
		this.datos = datos;
		this.carnet = carnet;
		this.dni = dni;
		this.numDias = numDias;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehiculo getDatos() {
		return datos;
	}

	public void setDatos(Vehiculo datos) {
		this.datos = datos;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public EstadoCoche getEstado() {
		return estado;
	}

	public void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carnet, datos, dni, estado, id, numDias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(carnet, other.carnet) && Objects.equals(datos, other.datos)
				&& Objects.equals(dni, other.dni) && estado == other.estado && id == other.id
				&& numDias == other.numDias;
	}
	
	

}
