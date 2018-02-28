package com.zz.designpattern.factory.ingredient;
/**
 * @author Francis.zz
 * 描述:原料类面团，可以添加其他属性，方法
 * create on 2015年11月30日
 */
public abstract class Dough {
	String disc;  // 描述信息
	/**
	 * 粗象方法：描述是什么原料做的面团
	 */
	public void discription() {
		System.out.println("面团描述：" + disc);
	}
}
