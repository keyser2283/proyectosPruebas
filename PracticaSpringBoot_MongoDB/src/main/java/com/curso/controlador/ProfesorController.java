package com.curso.controlador;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.curso.delegate.IProfesorDelegate;
import com.curso.modelo.entidad.Profesor;


@Controller
public class ProfesorController {

	@Autowired
	private IProfesorDelegate profesorDelegate;
		
	public IProfesorDelegate getProfesorDelegate() {
		return profesorDelegate;
	}

	public void setProfesorDelegate(IProfesorDelegate profesorDelegate) {
		this.profesorDelegate = profesorDelegate;
	}


	//Usaremos este m�todo para mostrar la p�gina por ejemplo cuando venimos
	//desde otro lugar de la aplicaci�n
	//GET
	@RequestMapping("/mostrarProfesores")
	public ModelAndView mostrarPagina(@ModelAttribute(value="profesor")Profesor profesor){
		System.out.println("=========================");
		System.out.println("Mostrando...");
		//FORWARD
		return new ModelAndView("profesoresListado");
	}
	

	//Para redirigir a la pagina de insertar un nuevo profesor
	@RequestMapping("/profesorFormulario")
	public ModelAndView pFormulario(@ModelAttribute(value = "profesor") Profesor p) {
		// FORWARD
		return new ModelAndView("profesorFormulario");
	}
	
	
	//metodo para insertar un nuevo profesor
	@RequestMapping("/insertarProfesor")
	//POST
	public String insertar(@ModelAttribute(value="profesor")Profesor profesor){
		
		System.out.println("=========================");
		System.out.println("Insertando: "+profesor);
	
		profesorDelegate.insertarProfesor(profesor);
		//Si quisieramos vaciar el formulario debemos vaciar el coche...a mano!
		//REDIRECT
		return "redirect:/mostrarProfesores.htm";
	}
	
	@RequestMapping("/borrarProfesor")
	public String borrar(@RequestParam(value="idProfesor") int id) {

		Profesor p = new Profesor();
		p.setIdProfesor(id);
		profesorDelegate.borrarProfesor(p);
		// REDIRECT
		return "redirect:/mostrarProfesores.htm";
	}	
	
	

	@RequestMapping("/seleccionarProfesor")
	public ModelAndView seleccionar(@ModelAttribute(value="profesor")Profesor p, @RequestParam(value="idProfesor") int idProfesor, HttpServletRequest request){
		
		System.out.println("=========================");
		String idProfesorStr = request.getParameter("idProfesor");
		System.out.println("ID:"+idProfesorStr);
		
		System.out.println(p.getIdProfesor());
		
		//Esto se puede mejorar
		Profesor p1 = profesorDelegate.obtenerProfesor(idProfesor);
		p.setIdProfesor(p1.getIdProfesor());
		p.setNombre(p1.getNombre());
		p.setApellidos(p1.getApellidos());
		p.setUsername(p1.getUsername());
		p.setPassword(p1.getPassword());
		
		//FORWARD
		return new ModelAndView("profesorFormulario");
	}
	
	
	@RequestMapping("/modificarProfesor")
	public ModelAndView modificar(@ModelAttribute(value="profesor") Profesor profesor){
		
		profesorDelegate.modificarProfesor(profesor);
		//REDIRECT
		return new ModelAndView("redirect:mostrarProfesores.htm");
	}
	
	
	//Este m�todo sirve para 'preparar los datos para la vista'
	@ModelAttribute(value="listadoProfesores")
	public List<Profesor> getListadoProfesores(){
		return profesorDelegate.listarProfesores();
	}
	
	
}
