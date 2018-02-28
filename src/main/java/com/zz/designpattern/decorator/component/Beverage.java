package com.zz.designpattern.decorator.component;
/**
 * create by Francis.zz on 20151115
 */
public abstract class Beverage {
	protected String description = "饮料";
	
	public String getDescription() {
		return description;
	}
	/**
	 * 成本
	 * @return double
	 */
	public abstract double cost();
}
