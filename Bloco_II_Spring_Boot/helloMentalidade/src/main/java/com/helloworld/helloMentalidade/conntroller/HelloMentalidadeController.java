package com.helloworld.helloMentalidade.conntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloMentalidade")

public class HelloMentalidadeController {

	@GetMapping
	public String helloMentalidade() {
		return "A mentalidade de hoje para resolver essa questão foi: \n\n"
				+"		"+"------------------------------\n" 
				+"		"+		"| MENTALIDADE DE CRESCIMENTO |\n"
				+"		"+		"------------------------------";
	}
}
