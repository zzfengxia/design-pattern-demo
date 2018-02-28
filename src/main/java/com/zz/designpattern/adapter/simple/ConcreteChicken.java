package com.zz.designpattern.adapter.simple;

/**
 * Created by Francis.zz on 2015/12/15.
 * 描述：
 */
public class ConcreteChicken implements Chicken {
    @Override
    public void cluck() {
        System.out.println("咯咯叫...");
    }

    @Override
    public void fly() {
        System.out.println("飞行...");
    }
}
