package boletin2;

public class NotaAsignatura {

	String nombreA;
	int primT;
	int segunT;
	int tercerT;
	
	public NotaAsignatura(String nombreA, int primT, int segunT, int tercerT) {
		super();
		this.nombreA = nombreA;
		this.primT = primT;
		this.segunT = segunT;
		this.tercerT = tercerT;
	}


	public float calculaMedia() {
		float media =((primT+segunT+tercerT)/3);
		return media;
	}
	
	int Calculanumtrimestreaprobado () {
		
		int numtri = 0;
		if(primT >= 5) {
			numtri=1;
		}
		else if (primT >=5 && segunT >=5) {
			numtri=2;
		}
		else if (primT >=5 && segunT >=5 && tercerT >= 5) {
			numtri = 3;
		}
		else {
			numtri = 0;
		}
		return numtri;
	}
	public String toString() {
		return "NotaAsignatura [nombre=" + nombreA + ", primT=" + primT + ", segunT=" + segunT + ", tercerT=" + tercerT
				+ "]";
	}
}
