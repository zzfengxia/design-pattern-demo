package com.zz.designpattern.factory.ingredient;
/**
 * @author Francis.zz
 * 描述: 具体的原料工厂，具体生产特定风味的原料
 * create on 2015年11月30日
 */

public class CHNPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ChineseDough();
	}

	public Cheese createCheese() {
		return new ChineseCheese();
	}

}
