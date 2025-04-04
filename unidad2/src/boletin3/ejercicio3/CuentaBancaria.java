package boletin3.ejercicio3;

public class CuentaBancaria {

	private double saldo;
	private String numCuenta;
	private Persona titular;
	private Persona autorizado;
	
	public CuentaBancaria(double saldo, String numCuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
		//this.autorizado = null;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Persona getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}
	
	private boolean validacionimportepositivo (double importe) {
		return importe > 0;
	}
	
	private boolean validarautorizado (String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}
	
	public void ingresardinero(Persona personagestion, double ingreso) {
		if (validarautorizado(personagestion.getDni()) && validacionimportepositivo(ingreso)) {
			setSaldo(getSaldo() + ingreso);
		} else {
			System.out.println("Error: No es autorizado o ingreso correcto ");
		}
			
	}
	public void retirarDinero (Persona personagestion, double reintegro) {
		if (validarautorizado(personagestion.getDni()) && validacionimportepositivo(reintegro) && getSaldo() >= reintegro) {
			setSaldo(getSaldo() - reintegro);
		}
		else {
			System.out.println("Error: no esta autorizado o el reintegro es incorrecto");
		}
	}
	public void eliminarautorizado(String dni) {
		if (validarautorizado(dni)) {
			autorizado = null;
		} else {
			System.out.println("Error: La persona no esta autorizada");
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numCuenta=" + numCuenta + ", titular=" + titular + ", autorizado="
				+ autorizado + "]";
	}
	
	
	
}
