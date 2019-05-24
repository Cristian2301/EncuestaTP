package encuesta;

import java.util.ArrayList;

public class PreguntaOpcionMultiple extends Pregunta {
	private ArrayList <Respuesta> opciones;
	private ArrayList <Respuesta> respuestas;
	
	public ArrayList<Respuesta> getOpciones() {
		return opciones;
	}
	
	public void setOpciones(ArrayList<Respuesta> opciones) {
		this.opciones = opciones;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public PreguntaOpcionMultiple () {
		this.opciones = new ArrayList<Respuesta>();
		this.respuestas = null;
	}
	
	@Override
	protected Pregunta preguntaSiguiente(){
		return this.opciones.get(0).getPreguntaSiguiente();
	}
}
