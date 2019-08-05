package com.darioprod.beautyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioprod.beautyapp.model.Item;
import com.darioprod.beautyapp.model.Product;
import com.darioprod.beautyapp.service.ItemService;
import com.darioprod.beautyapp.service.ProductService;
import com.darioprod.beautyapp.service.ReasonService;

@Controller
@RequestMapping("/produtos")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@Autowired
	private ItemService itemService;

	@Autowired
	private ReasonService reasonService;

	@GetMapping("/cadastrar")
	public String registerProduct(Product product) {
		return "/product/register";
	}
	
	@PostMapping("/salvar")
	public String save(Product product, RedirectAttributes attr) {
		productService.save(product);
		attr.addFlashAttribute("Success", "Produto cadastrado com sucesso");
		return "redirect:/produtos/cadastrar";
	}	
	
	@GetMapping("/listar-produtos")
	public String listRegisteredProducts(ModelMap model) {
		model.addAttribute("products", productService.findAll());
		return "/product/listRegisteredProducts";
	}	

	@GetMapping("/editar/{id}")
	public String preEdit(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("product", productService.findById(id));
		return "product/register";
	}
	
	@PostMapping("/editar")
	public String edit(Product product, RedirectAttributes attr) {
		productService.update(product);
		attr.addFlashAttribute("success", "Produto editado com sucesso.");
		return "redirect:/produtos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes attr) {
		productService.delete(id);
		attr.addFlashAttribute("success", "Produto removido com sucesso.");
		return "redirect:/produtos/listar-produtos";
	}
	
	@GetMapping("/buscar/nome")
	public String getByName(@RequestParam("nome") String name, ModelMap model) {
		model.addAttribute("products", productService.findByName(name));
		return "/product/list";
	}
	
	@GetMapping("/estoque")
	public String listStock() {
		return "/product/listStock";
	}
	
	@GetMapping("/listar-entrada-saida")
	public String listEntryAndOutput() {
		return "/product/listEntryAndOutput";
	}
	
	@GetMapping("/entrada-produto")
	public String productEntry(ModelMap model, Item item) {
		model.addAttribute("products", productService.findAll());
		return "/product/entry";
	}
	
	@PostMapping("/entrada-produto/salvar")
	public String productEntrySave(Item item, RedirectAttributes attr){
		itemService.save(item);
		attr.addFlashAttribute("success", "Entrada de produto realizada com sucesso");
		return "redirect:/produtos/entrada-produto";
	}			
	
	@GetMapping("/saida-produto")
	public String productOutput(Item item, ModelMap model) {
		model.addAttribute("products", productService.findAll());
		model.addAttribute("reasons", reasonService.findAll());
		return "/product/output";
	}
	
	
	
}
