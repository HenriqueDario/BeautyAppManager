package com.darioprod.beautyapp;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeautyAppApplication {
	

	@PostConstruct 
	public void started() {   
	     TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo")); 
	}  

	public static void main(String[] args) {
		SpringApplication.run(BeautyAppApplication.class, args);
	}

}
