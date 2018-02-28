package com.zz.designpattern.decorator.decorator;

import com.zz.designpattern.decorator.component.Beverage;

/**
 * @author Francis.zz
 * 调味品
 */
public abstract class Condiment extends Beverage {
	public abstract String getDescription();
}
