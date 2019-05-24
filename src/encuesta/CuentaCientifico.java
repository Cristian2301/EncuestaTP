package encuesta;

import java.util.ArrayList;

public class CuentaCientifico {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrase�a;
	private Integer edad;
	private ArrayList<Proyecto> proyectos;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public Integer getEdad() {
		return edad;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public CuentaCientifico(String nombre, String apellido, String usuario, String contrase�a, Integer edad) {
		this.proyectos = new ArrayList<Proyecto>();
		this.apellido = apellido;
		this.contrase�a = contrase�a;
		this.usuario = usuario;
		this.edad = edad;
		this.nombre = nombre;
	}
}
