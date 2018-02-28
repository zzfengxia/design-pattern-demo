package com.zz.designpattern.adapter.simple;

/**
 * Created by Francis.zz on 2015/12/15.
 * 描述：
 */
public class MainTest {
    public static void main(String[] args) {
        ConcreteChicken ck = new ConcreteChicken();

        Duck duckAdapter = new ChickenToDuck(ck);

        duckAdapter.quack();
        duckAdapter.fly();
    }
}
