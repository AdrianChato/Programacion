package Controladorexamenejer1;

import Modeloexamenejer1.*;
import Simulacrovuelo.Vueloexception;

public class GestionaMiembros {
	public static void main(String[] args) throws GuzmanitosException {
		
		MiembroEstandar e1 = new MiembroEstandar("ouwf@fmail.com", "Pepito");
		MiembroEstandar e2 = new MiembroEstandar("ouwwefrgberf@fmail.com", "Pepa");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		MiembroPremium p1 = new MiembroPremium("buipeuiprgb@gmail.com", "rafa", TipoPremium.PREMIUM);
		MiembroPremium p2 = new MiembroPremium("b232354euiprgb@gmail.com", "diego", TipoPremium.PREMIUM_VIP);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		try {
			e1.addMiembro(e2);
		} catch (GuzmanitosException excepcion) {
			System.out.println((excepcion.getMessage()));
			throw excepcion;
		}
		
		try {
			e2.addMiembro(e1);
		} catch (GuzmanitosException excepcion) {
			System.out.println((excepcion.getMessage()));
			throw excepcion;
		}
		try {
			e2.addMiembro(p1);
		} catch (GuzmanitosException excepcion) {
			System.out.println((excepcion.getMessage()));
			throw excepcion;
		}
		try {
			e2.addMiembro(p2);
		} catch (GuzmanitosException excepcion) {
			System.out.println((excepcion.getMessage()));
			throw excepcion;
		}
		
		p1.addMiembro(e2);
		p1.addMiembro(e1);
		
		System.out.println(p1.isAmigo(p2));
		System.out.println(p1.isAmigo(e1));
		
		}
	
	
	}
