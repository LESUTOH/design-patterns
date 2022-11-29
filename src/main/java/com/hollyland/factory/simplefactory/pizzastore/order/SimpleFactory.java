package com.hollyland.factory.simplefactory.pizzastore.order;

import com.hollyland.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.hollyland.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.hollyland.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.hollyland.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greek ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheese");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("pepper");
		}
		
		return pizza;
	}
	
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		
		return pizza;
	}

}
