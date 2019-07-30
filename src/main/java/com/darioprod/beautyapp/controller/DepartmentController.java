package com.darioprod.beautyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Department;
import com.darioprod.beautyapp.service.DepartmentService;

@Controller
@RequestMapping("/departamentos")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/cadastrar")
	public String register(Department department) {
		return "/department/register";
	}
	
	@GetMapping("/listar")
	public String list(ModelMap model) {
		model.addAttribute("departments", departmentService.findAll());
		return "/department/list";
	}
	
	@PostMapping("/salvar")
	public String save(Department department, RedirectAttributes attr) {
		departmentService.save(department);
		attr.addFlashAttribute("success", "Departamento adicionado com sucesso");
		return "redirect:/departamentos/cadastrar";		
	}
	
	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("department", departmentService.findById(id));
		return "/department/register";
	}
	
	@PostMapping("/editar")
	public String Edit(Department department, RedirectAttributes attr) {
		departmentService.update(department);
		attr.addFlashAttribute("success", "Departamento editado com sucesso.");
		return "redirect:/departamentos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, ModelMap model) {		
		
		if(departmentService.departmentHavePositions(id)) {
			model.addAttribute("fail", "Departamento não removido. Possui cargo(s) vinculado(s).");			
		}else {
			departmentService.delete(id);
			model.addAttribute("success", "Departamento removido com sucesso.");
		}		

		return list(model);
		
		
		
	}
	
	
	
	
	
}
