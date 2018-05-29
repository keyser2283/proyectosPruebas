package com.curso.delegate;

import java.util.List;
import java.util.Optional;

import com.curso.modelo.entidad.Profesor;




public interface IProfesorDelegate {
	
	//METODOS PARA PROFESORES
	
	public void insertarProfesor(Profesor p);	
	
	public Profesor obtenerProfesor(int id);
	
	public void modificarProfesor(Profesor p);
	
	public void borrarProfesor(Profesor p);
	
	public List<Profesor> listarProfesores();
	
	
}
