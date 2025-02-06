package boletin3;

public class Gestionatorneo {
		
		public static void main(String[] args) {
			
			Participante part1 = new Participante ("Jcviejo", "JuankaPronlematik", 104,1);
			Participante part2 = new Participante ("Elgay", "Elmartin", 19,23);
			Participante part3 = new Participante ("shibatoperro", "rodrigopineda", 19,21);
			Participante part4 = new Participante ("elnavajero", "rendon", 22,19);
			
			Participante [] jugadores = {part1,part2,part3,part4};
			Partida juego1 = new Partida("Catán", jugadores);
			Partida juego2 = new Partida("Dixit", jugadores);
			Partida juego3 = new Partida("Carcasonne", jugadores);
			
			juego1.imprimeGanador();
		}

	}
