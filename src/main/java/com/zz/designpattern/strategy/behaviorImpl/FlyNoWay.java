package com.zz.designpattern.strategy.behaviorImpl;

import com.zz.designpattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("贴地飞行!");
	}

}
