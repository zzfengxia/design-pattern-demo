package com.zz.designpattern.strategy.behaviorImpl;

import com.zz.designpattern.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("振翅飞行!");
	}

}
