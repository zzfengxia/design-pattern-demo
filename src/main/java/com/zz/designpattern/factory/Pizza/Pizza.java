package com.zz.designpattern.factory.Pizza;

import com.zz.designpattern.factory.ingredient.Cheese;
import com.zz.designpattern.factory.ingredient.Dough;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francis.zz
 * 描述:披萨超类
 * create on 2015年11月18日
 */
public abstract class Pizza {
	String name; //名称
	Dough dough; //面团类型
	String suace; //酱料类型
	Cheese cheese;
	List<String> topping = new ArrayList();  //作料
	/**
	 * 准备制作Pizza
	 */
	public abstract void prepare();
	/**
	 * 烘烤
	 */
	public void back() {
		System.out.println("烘烤20分钟...");
	}
	/**
	 * 切片
	 */
	public void cut() {
		System.out.println("将披萨切片...");
	}
	/**
	 * 装盒
	 */
	public void box() {
		System.out.println("装盒打包...");
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getDesc() {
		System.out.println();
	}
}
