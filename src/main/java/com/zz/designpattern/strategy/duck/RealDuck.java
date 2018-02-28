package com.zz.designpattern.strategy.duck;

import com.zz.designpattern.strategy.behaviorImpl.FlyWithWings;
import com.zz.designpattern.strategy.behaviorImpl.Quack;

/**
 * 具体的鸭子类
 * @author Francis.zz
 *
 */
public class RealDuck extends Duck {
    // 构造方法，为鸭子赋予特性
    public RealDuck(){
        // 飞行
        flyBehavior = new FlyWithWings();
        // 叫
        quackBehavior = new Quack();
    }

    public void perform(){
        performQuack();
        performFly();
    }

}
