package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientController {

	@GetMapping("/cadastrar")
	public String clientRegister() {		
		return "/client/register";
	}
	
	@GetMapping("/listar")
	public String listClients() {
		return "/client/list";
	}
	
}
