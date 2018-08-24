package net.roseindia.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ByeWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mv = new ModelAndView("bye");
		mv.addObject("adiosMensaje", "Bye Caracola!");
		return mv;
	}

}
