package com.hollyland.decorator;

/**
 * 具体的Decorator，这里就是调味品
 * @author lesuto
 */
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		// 调味品 的价格
		setPrice(3.0f);
	}

}
