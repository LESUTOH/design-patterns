package com.hollyland.domain;

import com.hollyland.behavior.fly.FlyWithWings;
import com.hollyland.behavior.quack.Quack;

/**
 * @ClassName MallardDuck
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 13:59
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
