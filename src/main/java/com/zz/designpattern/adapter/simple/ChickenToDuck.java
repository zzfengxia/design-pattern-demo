package com.zz.designpattern.adapter.simple;

/**
 * Created by Francis.zz on 2015/12/15.
 * 描述：
 */
public class ChickenToDuck implements Duck {
    Chicken chicken;

    public ChickenToDuck(Chicken ck) {
        this.chicken = ck;
    }
    @Override
    public void quack() {
        chicken.cluck();
    }

    @Override
    public void fly() {
        int i = 0;
        while(i < 3) {
            chicken.fly();
            i++;
        }
    }
}
