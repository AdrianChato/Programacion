package PruebaIterar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class NotaAlumno {

	public static void main(String[] args) {
		
		Map<Persona,Nota> m = new HashMap <Persona,Nota>();
		Persona carla = new Persona("Carla");
		Persona sofia = new Persona("Sofia");
		Persona pedro = new Persona("Pedro");
		
		Nota n1 = new Nota(5);
		Nota n2 = new Nota(8);
		
		m.put(pedro, n2);
		m.put(sofia, n1);
		m.put(carla, n1);
		NotaAlumno p = new NotaAlumno();
		float media = p.calculaNotaMedia(m);
		System.out.println(media);
		List <Persona> alumnosencimademedia = p.getPersonaporencimaNota(media));
		
	}
	
	Set<Entry<Persona, Nota>> getPersonaporencimaNota(float nota) {
		Map<Persona,Nota> m = new HashMap <Persona,Nota>();
		Set<Map.Entry<Persona, Nota>> notamedia = m.entrySet();
		Entry<Persona, Nota> elemento;
		Iterator it = notamedia.iterator();
		while (it.hasNext()) {
			elemento = (Entry<Persona, Nota>) it.next();
			if (elemento.getValue().getNota() > nota) {
				notamedia.add((Entry<Persona, Nota>) elemento.getKey());
			}
		}
		return notamedia;
	}
	
	float calculaNotaMedia(Map <Persona,Nota> m) {
		float media = 0;
		Collection <Nota> notas = m.values();
		for (Nota n : notas) {
			media = media + n.getNota();
		}
		media = media / notas.size();
		return media;
	}
	
	
}
