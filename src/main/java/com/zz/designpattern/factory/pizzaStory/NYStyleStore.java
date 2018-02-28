package com.zz.designpattern.factory.pizzaStory;

import com.zz.designpattern.factory.Pizza.NYStyeleSweetPizza;
import com.zz.designpattern.factory.Pizza.NYStyleCheesePizza;
import com.zz.designpattern.factory.Pizza.Pizza;

public class NYStyleStore extends PizzaStore {

	public Pizza craetePizza(String type) {
		switch (type) {
		case "cheese":
			return new NYStyleCheesePizza();
		case "sweet":
			return new NYStyeleSweetPizza();
		}
		return null;
	}

}
