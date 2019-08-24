package com.darioprod.beautyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Client;
import com.darioprod.beautyapp.model.UF;
import com.darioprod.beautyapp.service.ClientService;

@Controller
@RequestMapping("/clientes")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/cadastrar")
	public String register(Client client) {
		return "/client/register";
	}
	
	@GetMapping("/listar")
	public String list(ModelMap model) {
		model.addAttribute("clients", clientService.findAll());
		return "/client/list";
	}
	
	@PostMapping("/salvar")
	public String save(Client client, RedirectAttributes attr) {
		clientService.save(client);
		attr.addFlashAttribute("Success", "Cliente cadastrado com sucesso");
		return "redirect:/clientes/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("client", clientService.findById(id));
		return "/client/register";
	}
	
	@PostMapping("/editar")
	public String edit(Client Client, RedirectAttributes attr) {
		clientService.update(Client);
		attr.addFlashAttribute("success", "Cliente editado com sucesso.");
		return "redirect:/clientes/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes attr) {
		clientService.delete(id);
		attr.addFlashAttribute("success", "Cliente removido com sucesso.");
		return "redirect:/clientes/listar";
	}
	
	@GetMapping("/buscar/nome")
	public String getByName(@RequestParam("nome") String name, ModelMap model) {
		model.addAttribute("clients", clientService.findByName(name));
		return "/client/list";
	}	
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}
	
	
	
}
