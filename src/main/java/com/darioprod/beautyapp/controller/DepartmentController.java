package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartmentController {

	@GetMapping("/cadastrar")
	public String registerProduct() {
		return "/department/register";
	}
	
	@GetMapping("/listar")
	public String listProducts() {
		return "/department/list";
	}
	
}
