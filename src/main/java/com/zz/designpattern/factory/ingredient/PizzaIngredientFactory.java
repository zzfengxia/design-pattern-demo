package com.zz.designpattern.factory.ingredient;
/**
 * @author Francis.zz
 * 描述: 披萨原料工厂接口, 粗象工厂
 * create on 2015年11月30日
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Cheese createCheese();
	/**
	 * ***
	 * 创建对象的组合
	 * ***
	 */
}
