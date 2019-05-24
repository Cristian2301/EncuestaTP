package encuesta;

abstract public class Pregunta {
	protected String texto;
	
	protected abstract Pregunta preguntaSiguiente();
	
	
}
