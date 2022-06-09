package fr.eni.service;

import java.util.List;

import fr.eni.bo.Pizza;

public interface PizzaService {
	List<Pizza> getPizza();

	Pizza getPizzaById(int id);

	void ajouterPizza(Pizza pizza);

	void modifierPizza(Pizza pizza);

	void supprimerPizza(Integer id);

	void modifierRecettePizza(Integer id, Pizza pizza);
}
