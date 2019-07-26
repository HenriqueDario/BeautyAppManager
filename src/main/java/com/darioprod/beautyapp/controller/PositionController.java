package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class PositionController {

	
	@GetMapping("/cadastrar")
	public String registerPosition() {
		return "/position/register";
	}
	
	@GetMapping("/listar")
	public String listPositions() {
		return "/position/list";
	}
	
}
