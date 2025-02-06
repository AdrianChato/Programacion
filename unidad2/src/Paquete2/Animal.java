package Paquete2;

 public class Animal {
	String tipo;
	public String nombre;
	private int edad;
	

	public boolean caminar() {
		return true;
	}
	private void comer ()
	{
		System.out.println("Estoy comiendo");
	}
	
	public void Dardecomer() {
		if (tipo.equals("Perro")) {
			comer();
		}
		else {
			System.out.println("No come el animal");
		}
	}
	boolean sonDelMismoTipo(Animal a1,int numero) {
		boolean son = false;
		son = tipo.equals(a1.tipo);
		return son;
	}
}
