package Interfazdinamica;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {
	public static void main(String[] args) {
		List < String > lista = new ArrayList <String> ();
		lista.add("Pedro");
		lista.add("David");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		lista.remove(1);
		System.out.println(lista.size());
			
		for (String cadena: lista)
		{
			System.out.println(cadena);
		}

	}

}
