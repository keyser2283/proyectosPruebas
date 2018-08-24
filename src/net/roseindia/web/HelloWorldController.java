package net.roseindia.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class HelloWorldController implements Controller {
 
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
  
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("message", "Hello World!");
 
		return modelAndView;
	}
}
