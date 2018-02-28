package com.zz.designpattern.factory.pizzaStory;
import com.zz.designpattern.factory.Pizza.Pizza;

/**
 * @author Francis.zz
 * 描述:粗象Pizza工厂类
 * create on 2015年11月18日
 */
public abstract class PizzaStore {
	/**
	 * 制作披萨
	 * @param type 披萨类型
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = craetePizza(type);
		pizza.prepare();
		pizza.back();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	// 工厂方法，创建需要的Pizza
	public abstract Pizza craetePizza(String type);
	
}
