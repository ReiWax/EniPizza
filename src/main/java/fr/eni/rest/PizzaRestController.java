package fr.eni.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.bo.Pizza;
import fr.eni.service.PizzaService;

@RestController
@RequestMapping("/rest")
public class PizzaRestController {
	
	private PizzaService pizzaService;
	
	public PizzaRestController(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}
	
	@CrossOrigin
	@GetMapping("/pizza")
	public List<Pizza> getPizza(){
	
		return pizzaService.getPizza();

	}

	@CrossOrigin
	@GetMapping("/pizza/{id}")
	public Pizza getPizza(@PathVariable("id") int id)
	{
		Pizza pizza = pizzaService.getPizzaById(id);
		System.out.println("getPizza : " + pizza);
		return pizza;
	}
	
	@CrossOrigin
	@PostMapping("/pizza")
	public ResponseEntity<Pizza> ajouterPizza(@RequestBody Pizza pizza)
	{
		
		if(pizza.getId()<=0) {
			return new ResponseEntity<Pizza>(HttpStatus.BAD_REQUEST);
		}
		
		pizzaService.ajouterPizza(pizza);
		
		return new ResponseEntity<Pizza>(pizza, HttpStatus.CREATED);
	}
	
	@CrossOrigin
	//@RequestMapping(path = "/pizza", method = RequestMethod.PUT)
	@PutMapping("/pizza")
	public Pizza modifierPizza(@RequestBody Pizza pizza)
	{
		pizzaService.modifierPizza(pizza);
		
		return pizza;
	}

	@CrossOrigin
	//@RequestMapping(path = "/pizza/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/pizza/{id}")
	public void supprimerPizza(@PathVariable("id") Integer id)
	{
		pizzaService.supprimerPizza(id);
		
	}

}
