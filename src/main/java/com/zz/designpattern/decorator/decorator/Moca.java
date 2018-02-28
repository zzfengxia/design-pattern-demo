package com.zz.designpattern.decorator.decorator;

import com.zz.designpattern.decorator.component.Beverage;

/**
 * @author Francis.zz
 */
public class Moca extends Condiment {
	// 组合
	private Beverage beverage;
	
	public Moca(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + "+moca";
	}

	public double cost() {
		return beverage.cost() + 5.5;
	}

}
