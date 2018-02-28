package com.zz.designpattern.factory.Pizza;
/**
 * @author Francis.zz
 * 描述:纽约风格的起司披萨
 * create on 2015年11月18日
 */
public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		this.name = "纽约风格的起司披萨";
//		this.dough = "小面团";
		this.suace = "东北大酱";
		
		this.topping.add("大葱");
		this.topping.add("味精");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
