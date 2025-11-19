package com.course.projectsourcecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.course.projectsourcecode.model.UserModel;

import jakarta.validation.Valid;

@Controller
public class HomeController {

	@GetMapping({ "/", "/login" })
	public String home(Model model) {
		model.addAttribute("message", "Hello, JSP with Spring Boot!");
		return "home"; // home.jsp in /WEB-INF/jsp/
	}
	
	@PostMapping("/dologin")
	public String doLogin(){		
		return "home";
	}
	

	@GetMapping("/register")
	public String showRegisterationForm(Model model) {
	    model.addAttribute("user", new UserModel());
		return "register";
	}

	
}
