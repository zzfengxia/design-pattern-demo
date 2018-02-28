package com.zz.designpattern.strategy.behaviorImpl;

import com.zz.designpattern.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("吱吱叫!");
	}

}
