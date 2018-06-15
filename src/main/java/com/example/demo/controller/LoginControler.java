package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Login;

@Controller
public class LoginControler {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("Login", "objeto", new Login());
	}
	
	@RequestMapping(value="/logado", method = RequestMethod.POST)
	public ModelAndView logado(Login login) {
		System.out.println(login);
		return new ModelAndView("logado", "objeto", login);
	}
}
