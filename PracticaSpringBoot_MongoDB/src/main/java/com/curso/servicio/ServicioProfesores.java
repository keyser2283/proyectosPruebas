package com.curso.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.delegate.IProfesorDelegate;
import com.curso.modelo.entidad.Profesor;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class ServicioProfesores {

	@Autowired
	private IProfesorDelegate profesorDelegate;
		
	public IProfesorDelegate getProfesorDelegate() {
		return profesorDelegate;
	}

	public void setProfesorDelegate(IProfesorDelegate profesorDelegate) {
		this.profesorDelegate = profesorDelegate;
	}

		
	@RequestMapping(value="profesores",
			method=RequestMethod.GET,
			produces="application/json")	
	public List<Profesor> listarProfesores(){
		return profesorDelegate.listarProfesores();
	}	
	
}





