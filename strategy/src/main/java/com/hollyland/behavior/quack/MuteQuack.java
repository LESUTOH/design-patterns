package com.hollyland.behavior.quack;

/**
 * @ClassName MuteQuack
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 13:54
 **/
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
