package com.hollyland.factory.absfactory.pizzastore.order;


import com.hollyland.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.hollyland.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.hollyland.factory.absfactory.pizzastore.pizza.Pizza;


public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
