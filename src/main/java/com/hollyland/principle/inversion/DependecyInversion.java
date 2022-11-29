package com.hollyland.principle.inversion;

public class DependecyInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}

}


class Email {
	public String getInfo() {
		return "电子邮件信息: hello,world";
	}
}

/**
 * 完成Person接收消息的功能
 * 方式1完成
 * 1.简单，容易实现
 * 2.如果我们获取的对象是微信、短信等等，则新增类，同时Person也要增加相应的接收方法
 * 3.解决思路：引入一个抽象的接口，表示接收者，这样Person类与接口发生依赖
 * 因为email、weixin邓属于接收的范围，他们各自实现接口就可以了
 */
class Person {
	public void receive(Email email ) {
		System.out.println(email.getInfo());
	}
}
