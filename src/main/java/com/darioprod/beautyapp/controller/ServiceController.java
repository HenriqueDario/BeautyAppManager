package com.darioprod.beautyapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Service;
import com.darioprod.beautyapp.service.ServiceService;

@Controller
@RequestMapping("/servicos")
public class ServiceController {
	
	@Autowired
	private ServiceService serviceService;
	
	@GetMapping("/cadastrar")
	public String registerProduct(Service service) {
		return "/service/register";
	}
	
	@GetMapping("/listar")
	public String listProducts(ModelMap model) {
		model.addAttribute("services", serviceService.findAll());
		return "/service/list";
	}	
	
	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("service", serviceService.findById(id));
		return "/service/register";
	}

	@PostMapping("/editar")
	public String edit(@Valid Service service, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "/service/register";
		}
		
		serviceService.update(service);
		attr.addFlashAttribute("success", "Serviço editado com sucesso.");
		return "redirect:/servicos/cadastrar";
	}	
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes attr) {
		if(serviceService.serviceHasSchedules(id)) {
			attr.addFlashAttribute("fail", "Serviço não removido. Há agendamento(s) vinculado(s).");
		}else {
			serviceService.delete(id);
			attr.addFlashAttribute("success", "Serviço removido com sucesso");
		}
		return "redirect:/servicos/listar";
	}		
	
	@PostMapping("/salvar")
	public String save(@Valid Service service, BindingResult result , RedirectAttributes attr){
		
		if(result.hasErrors()) {
			return "services/register";
		}
		
		serviceService.save(service);
		attr.addFlashAttribute("success", "Serviço adicionado com sucesso");
		return "redirect:/servicos/listar";
	}
	
	
}
