package com.curso.delegate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.manager.IProfesorManager;
import com.curso.modelo.entidad.Profesor;


@Component
public class ProfesorDelegate implements IProfesorDelegate {

	@Autowired
	private IProfesorManager profesorManager;

	public IProfesorManager getProfesorManager() {
		return profesorManager;
	}

	public void setProfesorManager(IProfesorManager profesorManager) {
		this.profesorManager = profesorManager;
	}

	//METODOS PARA PROFESORES
	//insertar profesor
	public void insertarProfesor(Profesor p) {
		getProfesorManager().insertarProfesor(p);
	}
	
	//borrar profesor
	public void borrarProfesor(Profesor p) {
		getProfesorManager().borrarProfesor(p);
	}
	
	//modificar profesor
	public void modificarProfesor(Profesor p) {
		getProfesorManager().updateProfesor(p);
	}
	
	//obtener profesor
	public Profesor obtenerProfesor(int id) {
		return getProfesorManager().obtenerProfesor(id);
	}

	//listar profesores
	public List<Profesor> listarProfesores() {
		return getProfesorManager().listarProfesores();
	}
	
}
