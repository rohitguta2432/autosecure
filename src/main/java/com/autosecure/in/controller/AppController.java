package com.autosecure.in.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView loginPage() {
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getDashboard() {
		
		return null;
	}
}
