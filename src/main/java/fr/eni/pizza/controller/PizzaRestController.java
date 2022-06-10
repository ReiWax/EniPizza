package fr.eni.pizza.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.pizza.bo.Pizza;
import fr.eni.pizza.service.PizzaService;

@RestController
@RequestMapping("/rest")
public class PizzaRestController {
	
	private PizzaService pizzaService;
	
	public PizzaRestController(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}
	
	@GetMapping("/pizzas")
	public List<Pizza> getPizzas(){
		return pizzaService.getPizza();
	}

	
	@GetMapping("/pizzas/{id}")
	public Pizza getPizza(@PathVariable("id") int id)
	{
		Pizza Pizza = pizzaService.getPizzaById(id);
		System.out.println("getPizza : " + Pizza);
		return Pizza;
	}
	
//	@PostMapping("/pizzas")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Pizza ajouterPizza(@RequestBody Pizza Pizza)
//	{
//		pizzaService.ajouterPizza(Pizza);
//		
//		return Pizza;
//	}
	
	@PostMapping("/pizzas")
	public ResponseEntity<String> ajouterPizza()
	{
		/*
		if(Pizza.getId()<=0) {
			return new ResponseEntity<Pizza>(HttpStatus.BAD_REQUEST);
		}*/
		
		pizzaService.ajouterPizza();
		
		return new ResponseEntity<String>("ok", HttpStatus.CREATED);
	}

	//@RequestMapping(path = "/pizzas", method = RequestMethod.PUT)
	@PutMapping("/pizzas/{id}")
	public Integer modifierPizza(@PathVariable Integer id)
	{
		pizzaService.modifierPizza(id);
		
		return id;
	}
	
	@PatchMapping("/pizzas/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public void modifierPizza2(@PathVariable Integer id, @RequestBody Pizza Pizza)
	{
		pizzaService.modifierPizza2(id, Pizza);
				
	}
	
	//@RequestMapping(path = "/pizzas/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/pizzas/{id}")
	public void supprimerPizza(@PathVariable("id") Integer id)
	{
		pizzaService.supprimerPizza(id);
		
	}
}