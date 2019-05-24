package encuesta;

import java.util.ArrayList;

public class CuentaCientifico {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public Integer getEdad() {
		return edad;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public CuentaCientifico(String nombre, String apellido, String usuario, String contraseña, Integer edad) {
		this.proyectos = new ArrayList<Proyecto>();
		this.apellido = apellido;
		this.contraseña = contraseña;
		this.usuario = usuario;
		this.edad = edad;
		this.nombre = nombre;
	}
}
