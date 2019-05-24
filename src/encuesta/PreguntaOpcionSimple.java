package encuesta;

import java.util.ArrayList;

public class PreguntaOpcionSimple extends Pregunta {
	private ArrayList <Respuesta> opciones;
	private Respuesta respuesta;
	
	public ArrayList<Respuesta> getOpciones() {
		return opciones;
	}

	public void setOpciones(ArrayList<Respuesta> opciones) {
		this.opciones = opciones;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}

	public PreguntaOpcionSimple() {
		this.opciones = new ArrayList <Respuesta>();
		this.respuesta = null;
	}

	@Override
	protected Pregunta preguntaSiguiente() {
		// TODO Auto-generated method stub
		return null;
	}
}
