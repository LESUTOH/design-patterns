package com.hollyland.adapter.classadapter;

/**
 * 被适配的类
 */
public class Voltage220V {
	//���220V�ĵ�ѹ
	public int output220V() {
		int src = 220;
		System.out.println("电压=" + src + "伏");
		return src;
	}
}
