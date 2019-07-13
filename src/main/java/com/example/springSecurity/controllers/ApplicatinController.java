package com.example.springSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApplicatinController {

	@RequestMapping(value = "/welcome",method=RequestMethod.GET)
	public String welcome() {
		return "welcome.jsp";
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login() {
		return "login.jsp";
	}
	
	@RequestMapping(value = "/logout-success",method=RequestMethod.GET)
	public String logout() {
		return "logout-success.jsp";
	}
}
