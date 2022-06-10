package fr.eni.pizza.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import fr.eni.pizza.bo.Pizza;

@Service
public class PizzaServiceImpl implements PizzaService{
	private List<Pizza> listePizza;
	public PizzaServiceImpl() {
		listePizza = new ArrayList<>();
	}
	@Override
	public List<Pizza> getPizza() {
		// TODO Auto-generated method stub
		return listePizza;
	}

	@Override
	public Pizza getPizzaById(int id) {
		Pizza pizzaARetourner=null;
		for(Pizza pizza:listePizza)
		{
			if(pizza.getId()==id)
			{
				pizzaARetourner=pizza;
				break;
			}
		}
		return pizzaARetourner;
	}

	@Override
	public void ajouterPizza() {
		var id = listePizza.size();
		listePizza.add(new Pizza(id + 1, "Margerita", "bon",15));
		listePizza.add(new Pizza(id + 2, "3 fromages", "bon",16));
		//listePizza.add(pizza);
	}

	@Override
	public void modifierPizza(Integer id) {
		for(Pizza c:listePizza)
		{
			if(c.getId() == id)
			{
				Random prix = new Random();
				c.setPrix(prix.nextInt(101));
				break;
			}
		}
		
	}

	@Override
	public void supprimerPizza(Integer id) {
		for(Pizza c:listePizza)
		{
			if(c.getId()==id)
			{
				listePizza.remove(c);
				break;
			}
		}
		
	}

	@Override
	public void modifierPizza2(Integer id, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
