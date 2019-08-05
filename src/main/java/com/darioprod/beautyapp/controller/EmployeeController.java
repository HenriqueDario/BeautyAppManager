package com.darioprod.beautyapp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Employee;
import com.darioprod.beautyapp.model.Position;
import com.darioprod.beautyapp.model.UF;
import com.darioprod.beautyapp.service.EmployeeService;
import com.darioprod.beautyapp.service.PositionService;

@Controller
@RequestMapping("/funcionarios")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PositionService positionService;
	
	@GetMapping("/cadastrar")
	public String register(Employee employee) {
		return "/employee/register";
	}
	
	@GetMapping("/listar")
	public String list(ModelMap model) {
		model.addAttribute("employees", employeeService.findAll());
		return "/employee/list";
	}
	
	@PostMapping("/salvar")
	public String save(Employee employee, RedirectAttributes attr) {
		employeeService.save(employee);
		attr.addFlashAttribute("Success", "Funcionário cadastrado com sucesso");
		return "redirect:/funcionarios/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("employee", employeeService.findById(id));
		return "employee/register";
	}
	
	@PostMapping("/editar")
	public String edit(Employee employee, RedirectAttributes attr) {
		employeeService.update(employee);
		attr.addFlashAttribute("success", "Funcionário editado com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes attr) {
		employeeService.delete(id);
		attr.addFlashAttribute("success", "Funcionário removido com sucesso.");
		return "redirect:/funcionarios/listar";
	}
	
	@GetMapping("/buscar/nome")
	public String getByName(@RequestParam("nome") String name, ModelMap model) {
		model.addAttribute("employees", employeeService.findByName(name));
		return "/employee/list";
	}
	
	@GetMapping("/buscar/cargo")
	public String getByPosition(@RequestParam("id") Long id, ModelMap model) {
		model.addAttribute("employee", employeeService.findByPositionId(id));
		return "/employee/list";
	}
	
	@GetMapping("/buscar/data")
	public String getByDate(@RequestParam("entrada") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate entrada, @RequestParam("saida") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate saida, ModelMap model) {
		model.addAttribute("employee", employeeService.findByDate(entrada, saida));
		return "/employee/list";
	}	
	
	@ModelAttribute("positions")
	public List<Position> getCargos(){
		return positionService.findAll();
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}
	
}
