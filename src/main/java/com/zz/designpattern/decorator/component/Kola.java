package com.zz.designpattern.decorator.component;
/**
 * create by Francis.zz
 */
public class Kola extends Beverage {
	public Kola() {
		description = "可乐";
	}

	public double cost() {
		return 6.5;
	}

}
