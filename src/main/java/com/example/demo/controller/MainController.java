package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView ma = new ModelAndView("login");
		ma.addObject("login", "true");
		return ma;
	}
	
	@RequestMapping("/error2")
	public String error() {
		return "documentation";
	}
	
	@RequestMapping("/")
	public ModelAndView root(HttpSession httpSession) {
		ModelAndView ma = new ModelAndView("index");
		return ma;
	}

}
