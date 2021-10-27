package com.helloworld.helloObjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloObjetivos")

public class HelloObjetivosController {
	
	@GetMapping
		public String helloObjetivos() {
			return "Objetivos de aprendizagem: \n\n" 
					+" 1º - Praticar exercícios voltado ao SpringBoot, \n"
					+" 2º - Estudar mais sobre a plataforma SpringBoot, \n"
					+" 3º - Assistir vídeos que me ajudem a entender melhor como o SpringBoot funciona.";	
	}

}
