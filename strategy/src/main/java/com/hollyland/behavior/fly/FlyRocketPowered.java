package com.hollyland.behavior.fly;

/**
 * @ClassName FlyRocketPowered
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 14:06
 **/
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with a rocket");
    }
}
