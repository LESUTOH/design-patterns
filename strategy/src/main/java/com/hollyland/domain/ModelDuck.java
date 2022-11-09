package com.hollyland.domain;

import com.hollyland.behavior.fly.FlyNoWay;
import com.hollyland.behavior.quack.Quack;

/**
 * @ClassName ModelDuck
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 14:04
 **/
public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
