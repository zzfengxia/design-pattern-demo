package com.zz.designpattern.factory.ingredient;
/**
 * @author Francis.zz
 * 描述:原料类
 * create on 2015年11月30日
 */
public class Cheese {
	String desc;
	/**
	 * 粗象方法：描述是什么原料做的起司
	 */
	public void discription() {
		System.out.println("起司描述：" + desc);
	}
}
