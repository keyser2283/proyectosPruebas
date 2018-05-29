package com.curso.manager;

import java.util.List;
import java.util.Optional;

import com.curso.modelo.entidad.Profesor;


public interface IProfesorManager {
	
	public void insertarProfesor(Profesor p);	
	
	public Profesor obtenerProfesor(int id);
	
	public void updateProfesor(Profesor p);
	
	public void borrarProfesor(Profesor p);
	
	public List<Profesor> listarProfesores();

}
