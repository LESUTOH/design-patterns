package com.hollyland.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京胡椒pizza");
		System.out.println("北京胡椒pizza准备材料");
	}
}
