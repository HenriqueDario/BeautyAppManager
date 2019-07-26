package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProductController {

	@GetMapping("/cadastrar")
	public String registerProduct() {
		return "/product/register";
	}
	
	@GetMapping("/listar")
	public String listProducts() {
		return "/product/list";
	}
	
	@GetMapping("/entrada-produto")
	public String productEntry() {
		return "/product/entry";
	}
	
	@GetMapping("/saida-produto")
	public String productOutput() {
		return "/product/output";
	}
	
}
