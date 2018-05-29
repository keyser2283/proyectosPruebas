package com.curso.modelo.entidad;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profesores")
public class Profesor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int idProfesor;
	
	private String nombre;
	private String apellidos;
	private String username;
	private String password;
	
	//private Set<Asignatura> asignaturas = new HashSet<Asignatura>();

	/*public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}*/

	public Profesor() {
		super();
		System.out.println("Generando objeto Profesor");
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		System.out.println("Generando objeto Profesor");
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
