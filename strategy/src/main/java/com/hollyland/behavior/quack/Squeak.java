package com.hollyland.behavior.quack;

/**
 * @ClassName Squeak
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 13:55
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
