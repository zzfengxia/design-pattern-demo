package com.zz.designpattern.strategy;

import com.zz.designpattern.strategy.behaviorImpl.FlyNoWay;
import com.zz.designpattern.strategy.behaviorImpl.Squeak;
import com.zz.designpattern.strategy.duck.RealDuck;

public class MainTest {
	// 策略者模式
		public static void main(String[] args) {
			RealDuck duck = new RealDuck(); 
			duck.perform();
            // 改变鸭子的行为特性（不同的叫声，不同的飞行方式）
			duck.setFlyBehavior(new FlyNoWay());
			duck.setQuackBehavior(new Squeak());
			duck.perform();
		}
}
