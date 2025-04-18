package boletin3;

import java.util.Arrays;

public class Partida {

	private String nombrejuego;
	private Participante [] participantes;
	private Participante ganador;
	
	
	
	
	public Partida(String nombrejuego, Participante[] participantes) {
		super();
		this.nombrejuego = nombrejuego;
		this.participantes = participantes;
	}


	@Override
	public String toString() {
		return "Partida [nombrejuego=" + nombrejuego + ", participantes=" + Arrays.toString(participantes) + "]";
	}


	
	
	private int  calculaJugadorGanador()
	{
		int puntosGanador = 0;
		for (Participante p: this.participantes)
		{
			if(puntosGanador < p.getPuntuacion())
			{
				puntosGanador = p.getPuntuacion();
			}
		}
		
		return puntosGanador;
	}

	void imprimeGanador() 
	{
		int puntosGanador = calculaJugadorGanador();
		String nombreGanador;
		for (Participante p: this.participantes)
		{
			if(puntosGanador == p.getPuntuacion())
			{
				nombreGanador = p.getNombre();
				System.out.println(nombreGanador);
			}
		}
	}
	
}