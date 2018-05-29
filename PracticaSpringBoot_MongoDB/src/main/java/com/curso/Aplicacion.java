package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Aplicacion {

	public static void main(String[] args) {

		SpringApplication.run(Aplicacion.class, args);
		
		/*ApplicationContext ctx = SpringApplication.run(Aplicacion.class, args);
		IProfesorDelegate profDelegate = ctx.getBean(IProfesorDelegate.class);
		
		Profesor p=new Profesor();
		p.setNombre("Pepe");
		p.setApellidos("Perez");
		p.setUsername("admin");
		p.setPassword("1234");
		
		profDelegate.insertarProfesor(p);*/

		
	}

}
