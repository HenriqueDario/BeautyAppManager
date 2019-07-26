package com.darioprod.beautyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/relatorios")
public class ReportController {

	@GetMapping("/gerar-relatorios")
	public String generateReports() {	
		return "/report/generate";
	}
	
	@GetMapping("/agendar-relatorios")
	public String scheduleReport() {
		return "/report/schedule";
	}
	
}
