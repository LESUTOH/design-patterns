package com.hollyland.principle.inversion.improve;

public class DependecyInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		
		person.receive(new WeiXin());
	}

}

//����ӿ�
interface IReceiver {
	public String getInfo();
}

class Email implements IReceiver {
	@Override
	public String getInfo() {
		return "电子邮件信息: hello,world";
	}
}

//����΢��
class WeiXin implements IReceiver {
	@Override
	public String getInfo() {
		return "微信信息: hello,ok";
	}
}

//��ʽ2
class Person {
	public void receive(IReceiver receiver ) {
		System.out.println(receiver.getInfo());
	}
}
