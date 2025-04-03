package Controladorexamenejer2;

import Modeloexamenejer2.*;

public class GestionaRutas {
	
	public static void main(String[] args) {
	
	RutaBase [] rutaempresas = new RutaBase [50];
		
	Ciudad c1 = new Ciudad("Sevilla", 6000);
	Ciudad c2 = new Ciudad("Malaga", 5000);
	Ciudad c3 = new Ciudad("Jaen", 6700);
	Ciudad c4 = new Ciudad("Huelva", 9800);
	Ciudad c5 = new Ciudad("Cadiz", 9900);
	Ciudad c6 = new Ciudad("Almeria", 1200);
	
	RutaTerrestre t1 = new RutaTerrestre(1, "Sevilla", "Cadiz", 65, true);
	RutaAerea a1 = new RutaAerea(2, "Malaga", "Jaen", 300, Valores.EXPRESS);
	RutaAerea a2 = new RutaAerea(2, "Almeria", "Huelva", 800, Valores.LOW_COST);
	RutaAerea a3 = new RutaAerea(2, "Sevilla", "Almeria", 500, Valores.NORMAL);
	
	System.out.println(t1.getCoste());
	t1.getTipoRuta();
	System.out.println(a1.getCoste());
	a1.getTipoRuta();
	System.out.println(a2.getCoste());
	a2.getTipoRuta();
	System.out.println(a3.getCoste());
	a3.getTipoRuta();
	}
	
}
