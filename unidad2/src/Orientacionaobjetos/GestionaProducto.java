package Orientacionaobjetos;

public class GestionaProducto {

	public static void main(String[] args) {
		Producto producto1  = new Producto();
		producto1.nombre = "mesa";
		producto1.numUnidades = 12;
		producto1.precioVenta=400;
		
		Producto producto2 = new Producto();
		producto2.nombre = "silla";
		producto2.numUnidades = 2;
		producto2.precioVenta = 40;
		
		boolean pedido = producto1.pedirStock();
		System.out.println(pedido);
	
		int aumento = producto2.aumentounidades(7);
		System.out.println(aumento);
		
		String cadenapro1 = producto1.pasoAcadena();
		System.out.println(cadenapro1);
		String cadenapro2 = producto2.pasoAcadena();
		System.out.println(cadenapro2);
	}

}
