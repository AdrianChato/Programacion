package Simulacroult;

public class Empresas {

	private Empleados[] listaempleados;
	private Departamentos [] listadepartamentos;
	

	public Departamentos[] getListadepartamentos() {
		return listadepartamentos;
	}

	public void setListadepartamentos(Departamentos[] listadepartamentos) {
		this.listadepartamentos = listadepartamentos;
	}

	public Empleados[] getListaempleados() {
		return listaempleados;
	}

	public void setListaempleados(Empleados[] listaempleados) {
		this.listaempleados = listaempleados;
	}

	public Empresas(Empleados[] listaempleados, Departamentos[] listadepartamentos) {
		super();
		this.listaempleados = new Empleados[100];
		this.listadepartamentos = listadepartamentos;
	}

	
	
	
}
