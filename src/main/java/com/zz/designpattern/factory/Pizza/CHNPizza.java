package com.zz.designpattern.factory.Pizza;

import com.zz.designpattern.factory.ingredient.PizzaIngredientFactory;

/**
 * @author Francis.zz
 * 描述:中式风味披萨，使用中式风味的原料
 * create on 2015年11月30日
 */
public class CHNPizza extends Pizza {
	// 原料工厂
	PizzaIngredientFactory ingredientFactory;
	public CHNPizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}
	public void prepare() {
		dough = ingredientFactory.createDough();
		dough.discription();
		
		cheese = ingredientFactory.createCheese();
		cheese.discription();
	}
}
