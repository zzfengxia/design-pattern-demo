package com.zz.designpattern.strategy.behaviorImpl;

import com.zz.designpattern.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("啊啊啊!");
	}

}
