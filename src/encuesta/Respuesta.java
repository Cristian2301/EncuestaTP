package encuesta;

public class Respuesta {
	private String texto;
	private Pregunta preguntaSiguiente;
	
	public Pregunta getPreguntaSiguiente() {
		return preguntaSiguiente;
	}

	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Respuesta (Pregunta preguntaSiguiente) {
		this.texto = "";
		this.preguntaSiguiente = preguntaSiguiente;
	}
}
