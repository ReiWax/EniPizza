package fr.eni.pizza.service;

import java.util.List;

import fr.eni.pizza.bo.Pizza;

public interface PizzaService {
	List<Pizza> getPizza();

	Pizza getPizzaById(int id);
	
	void ajouterPizza();

	void modifierPizza(Integer id);

	void supprimerPizza(Integer id);

	void modifierPizza2(Integer id, Pizza pizza);
}
