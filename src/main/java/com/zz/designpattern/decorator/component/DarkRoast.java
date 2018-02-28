package com.zz.designpattern.decorator.component;
/**
 * create by Francis.zz
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast咖啡";
	}
	public double cost() {
		return 7;
	}

}
