package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class EmployeeController {

	@GetMapping("/cadastrar")
	public String registerEmployee() {
		return "/employee/register";
	}
	
	@GetMapping("/listar")
	public String listEmployees() {
		return "/employee/list";
	}
	
}
