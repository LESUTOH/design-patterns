package com.hollyland.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.hollyland.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

	// ������
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; // ��������������
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName(" greek ");
//			} else if (orderType.equals("greek")) {
//				pizza = new CheesePizza();
//				pizza.setName("greek");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("pepper");
//			} else {
//				break;
//			}
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//			
//		} while (true);
//	}

	//����һ���򵥹�������
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //�û������
		
		this.simpleFactory = simpleFactory; //���ü򵥹�������
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			
			//���pizza
			if(pizza != null) { //�����ɹ�
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" ��������ʧ�� ");
				break;
			}
		}while(true);
	}
	
	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
