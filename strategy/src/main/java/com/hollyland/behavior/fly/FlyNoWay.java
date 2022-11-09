package com.hollyland.behavior.fly;

/**
 * @ClassName FlyNoWay
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 13:53
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
