package com.zz.designpattern.strategy.duck;
import com.zz.designpattern.strategy.behavior.FlyBehavior;
import com.zz.designpattern.strategy.behavior.QuackBehavior;

/**
 * 鸭子超类
 * @author Francis.zz
 * create on 20151104
 */
public class Duck{
	// 使用内聚，低耦合（多用组合，少用继承）
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	// 声明实现行为的方法(调用接口的方法，实例化时自动绑定具体实现的行为)
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	// 增加 setter方法，使其子类可以动态的设置鸭子的行为
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
