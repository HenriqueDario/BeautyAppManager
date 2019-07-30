package com.darioprod.beautyapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Department;
import com.darioprod.beautyapp.model.Position;
import com.darioprod.beautyapp.service.DepartmentService;
import com.darioprod.beautyapp.service.PositionService;

@Controller
@RequestMapping("/cargos")
public class PositionController {

	
	@Autowired
	private PositionService positionService;
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/cadastrar")
	public String register(Position position) {
		return "/position/register";
	}
	
	@GetMapping("/listar")
	public String list(ModelMap model) {
		model.addAttribute("positions", positionService.findAll());
		return "/position/list";
	}	

	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("position", positionService.findById(id));
		return "/position/register";
	}

	@PostMapping("/editar")
	public String edit(@Valid Position position, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "/position/register";
		}
		
		positionService.update(position);
		attr.addFlashAttribute("success", "Cargo editado com sucesso.");
		return "redirect:/cargos/cadastrar";
	}	
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes attr) {
		if(positionService.positionHaveEmployees(id)) {
			attr.addFlashAttribute("fail", "Cargo não removido. Tem funcionário(s) vinculado(s).");
		}else {
			positionService.delete(id);
			attr.addFlashAttribute("success", "Cargo removido com sucesso");
		}
		return "redirect:/cargos/listar";
	}

	
	@PostMapping("/salvar")
	public String save(@Valid Position position, BindingResult result , RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "/position/register";
		}
		
		positionService.save(position);
		attr.addFlashAttribute("success", "Cargo adicionado com sucesso.");
		return "redirect:/cargos/cadastrar";
	}
	
	@ModelAttribute("departments")
	public List<Department> listOfDepartments(){
		return departmentService.findAll();
	}
	
}
