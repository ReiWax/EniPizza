package fr.eni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import fr.eni.bo.Pizza;

@Service
public class PizzaServiceImpl implements PizzaService{
	
	private List<Pizza> listePizza;
	

	public PizzaServiceImpl() {
		listePizza = new ArrayList<>();
		listePizza.add(new Pizza(1, "Marga", "Base Tomate / Fromage", 8));
		listePizza.add(new Pizza(2, "Savoyarde", "Lardon / Pomme de Terre / Fromage", 11));
	}

	@Override
	public List<Pizza> getPizza() {
		return listePizza;
	}

	@Override
	public Pizza getPizzaById(int id) {
		Pizza pizzaARetourner = null;
		for(Pizza pizza:listePizza) {
			if(pizza.getId() == id) {
				pizzaARetourner = pizza;
				break;
			}
		}
		return pizzaARetourner;
	}

	@Override
	public void ajouterPizza(Pizza pizza) {
		listePizza.add(pizza);
		
	}

	@Override
	public void modifierPizza(Pizza pizza) {
		for(Pizza p:listePizza) {
			if(p.getId()==pizza.getId()) {
				BeanUtils.copyProperties(pizza, p);
				break;
			}
		}
	}

	@Override
	public void supprimerPizza(Integer id) {
		for(Pizza p:listePizza) {
			if(p.getId()==id) {
				listePizza.remove(p);
				break;
			}
		}
	}

	@Override
	public void modifierRecettePizza(Integer id, Pizza pizza) {
		for(Pizza p:listePizza) {
			if(p.getId()==id) {
				p.setRecette(pizza.getRecette());
				break;
			}
		}
		
	}
	
	

}
