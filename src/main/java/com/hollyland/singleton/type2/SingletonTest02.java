package com.hollyland.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}


/**
 *  饿汉式（静态代码块）
 */
class Singleton {

	/**
	 * 构造器私有化，防止new
	 */
	private Singleton() {
		
	}


	/**
	 * 2.本类内部创建对象实例
	 */
	private static  Singleton instance;
	
	static {
		instance = new Singleton();
	}

	/**
	 * 3.提供一个共有的静态方法获取实例
	 * @return 实例
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}