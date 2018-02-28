package com.zz.designpattern.decorator.decorator;

import com.zz.designpattern.decorator.component.Beverage;

/**
 * @author Francis.zz
 */
public class Milk extends Condiment {
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "牛奶";
	}

	public double cost() {
		return beverage.cost() + 8;
	}

}
