package Orientacionaobjetos;

public class Pokemon {
	String nombre;
	int nivel;
	String tipo;
	
	String convierteencadena() {
		String cadena = "Pokemon:" + nombre + " nivel:" +nivel + " tipo:" +tipo;
		return cadena;
	}

	boolean figth(Pokemon p2) {
		boolean gana = true;
		if (nivel > p2.nivel) {
			gana = true;
			nivel = nivel +1;
		}
		else {
			gana = false;
			p2.nivel = p2.nivel +1;
		}
		return gana;
	}
	}
