package exception;

public class Miexcepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Miexcepcion(String mensaje) {
		super(mensaje);
		
		
	}

	@Override
	public String toString() {
		return "Miexcepcion [getMessage()=" + getMessage() + "]";
	}

	
	
	

}
