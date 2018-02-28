package com.zz.designpattern.factory.pizzaStory;

import com.zz.designpattern.factory.Pizza.CHNPizza;
import com.zz.designpattern.factory.Pizza.Pizza;
import com.zz.designpattern.factory.ingredient.CHNPizzaIngredientFactory;
import com.zz.designpattern.factory.ingredient.PizzaIngredientFactory;

public class ChinesePizzaStore extends PizzaStore{
	public Pizza craetePizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new CHNPizzaIngredientFactory();
		switch (type) {
		case "cheese":
			pizza = new CHNPizza(ingredientFactory);
			pizza.setName("中式起司披萨");
			break;
		}
		return pizza;
	}
}
