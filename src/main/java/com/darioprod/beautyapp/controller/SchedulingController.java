package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agendamentos")
public class SchedulingController {

	@GetMapping("/cadastrar")
	public String registerScheduling() {
		return "/scheduling/register";
	}
	
	@GetMapping("/listar")
	public String listScheduling() {
		return "/scheduling/list";
	}
}
