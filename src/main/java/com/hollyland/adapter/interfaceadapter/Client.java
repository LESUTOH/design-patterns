package com.hollyland.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbstractAdapter abstractAdapter = new AbstractAdapter() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了m1的方法");
			}
		};
		
		abstractAdapter.m1();
	}
}
