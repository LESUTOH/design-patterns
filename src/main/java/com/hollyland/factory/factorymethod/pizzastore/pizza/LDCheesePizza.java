package com.hollyland.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦奶酪pizza");
		System.out.println("伦敦奶酪pizza准备材料");
	}
}
