package fr.eni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {
	
	@GetMapping({"", "/", "/index"})
	public String afficherPagePizza() {
		return "index";
	}

}
