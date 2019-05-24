package encuesta;

public class PreguntaAbierta extends Pregunta {
	private Respuesta respuesta;

	@Override
	protected Pregunta preguntaSiguiente() {
		return this.respuesta.getPreguntaSiguiente();
	}
	
	public PreguntaAbierta(Pregunta preguntaSiguiente) {
		this.respuesta = new Respuesta (preguntaSiguiente);
	}
}
