package com.hollyland;

import com.hollyland.behavior.fly.FlyWithWings;
import com.hollyland.domain.Duck;
import com.hollyland.domain.MallardDuck;
import com.hollyland.domain.ModelDuck;
import org.junit.jupiter.api.Test;

/**
 * @ClassName MiniDuckSimulator
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/22 14:00
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perforQuack();
        mallard.performFly();
    }

    @Test
    void modelDuck() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
