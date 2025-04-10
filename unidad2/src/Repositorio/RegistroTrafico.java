package Repositorio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.Rematriculacion;
import modelo.Vehiculo;

import java.util.Map.Entry;

public class RegistroTrafico {
	private HashMap<Rematriculacion, Vehiculo> vehiculos;

	public HashMap<Rematriculacion, Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(HashMap<Rematriculacion, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "RegistroTrafico [vehiculos=" + vehiculos + "]";
	}

	public RegistroTrafico(HashMap<Rematriculacion, Vehiculo> vehiculos) {
		super();
		this.vehiculos = new HashMap<Rematriculacion, Vehiculo>();
	}

	public boolean agregarVehiculo(Rematriculacion r, Vehiculo v) {
		boolean registrado = false;
		if (v.equals(v)) {
			System.out.println("Este vehiculo ya está en la lista");
		} else {
			vehiculos.put(r, v);
			registrado = true;
		}
		return registrado;
	}

	RegistroTrafico p;

	public boolean registrarRematriculacion(Rematriculacion r) {
		boolean rematriculado = false;
		if (vehiculos.containsKey(r.getNum_bastidor()) && vehiculos.containsKey(r.getMatricula_final())
				&& vehiculos.containsKey(r.getFecha_matriculacion())) {
			rematriculado = true;
		} else {
			p.agregarVehiculo(null, null);
		}
		return rematriculado;
	}

	public boolean buscarVehiculoBasti(HashMap<String, Vehiculo> m) {
		boolean encontrado = false;
		for (Vehiculo n : m.values()) {
			if (m.containsKey(n)) {
				if (n.getNum_bastidor() != null) {
					encontrado = true;
				}
			}
		}
		return encontrado;
	}

	}
