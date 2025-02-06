package boletin3;

import java.util.Arrays;

public class Partida {

	String nombrejuego;
	Participante [] participantes;
	Participante ganador;
	
	
	
	
	public Partida(String nombrejuego, Participante[] participantes) {
		super();
		this.nombrejuego = nombrejuego;
		this.participantes = participantes;
	}


	@Override
	public String toString() {
		return "Partida [nombrejuego=" + nombrejuego + ", participantes=" + Arrays.toString(participantes) + "]";
	}


	Participante calculajugadormayorpunt () {
		
		
	}
}
