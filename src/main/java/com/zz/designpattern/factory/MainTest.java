package com.zz.designpattern.factory;

import com.zz.designpattern.factory.Pizza.Pizza;
import com.zz.designpattern.factory.pizzaStory.ChinesePizzaStore;
import com.zz.designpattern.factory.pizzaStory.NYStyleStore;
import com.zz.designpattern.factory.pizzaStory.PizzaStore;

/**
 * @author Francis.zz
 * 描述:测试工厂模式
 * create on 2015年11月18日
 */

public class MainTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStyleStore();
		PizzaStore chnStore = new ChinesePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("尼玛点了个 " + pizza.getName() + "\n");
		
		pizza = chnStore.orderPizza("cheese");
		System.out.println("Nick点了个 " + pizza.getName());
	}
}
