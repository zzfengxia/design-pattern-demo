package com.zz.designpattern.factory.Pizza;
/**
 * @author Francis.zz
 * 描述:纽约风格的甜披萨
 * create on 2015年11月18日
 */
public class NYStyeleSweetPizza extends Pizza{
	public NYStyeleSweetPizza() {
		this.name = "纽约风格的甜披萨";
//		this.dough = "小面团";
		this.suace = "白糖";
		
		this.topping.add("黄油");
		this.topping.add("味精");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
