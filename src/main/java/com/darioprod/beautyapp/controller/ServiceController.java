package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicos")
public class ServiceController {
	
	@GetMapping("/cadastrar")
	public String registerProduct() {
		return "/service/register";
	}
	
	@GetMapping("/listar")
	public String listProducts() {
		return "/service/list";
	}
}
