package encuesta;

import java.util.ArrayList;

public class Encuesta {
	private ArrayList<Pregunta> preguntas;
	private Pregunta preguntaActual;
	
	public Encuesta (Pregunta preguntaActual) {
		this.preguntas = new ArrayList <Pregunta>();
		this.preguntaActual = preguntaActual;
	}
	
	
	
	public void fueRespondida() {
		
	}
}
