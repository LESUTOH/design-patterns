package com.hollyland.behavior.quack;

/**
 * @ClassName Quack
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 13:54
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
