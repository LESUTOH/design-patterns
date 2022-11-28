package com.hollyland.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
 *  饿汉式：静态变量
 */
class Singleton {

	/**
	 * 1. 构造器私有化防止new
	 */
	private Singleton() {
		
	}

	/**
	 * 2.内部创建对象实例
	 */
	private final static Singleton instance = new Singleton();

	/**
	 * 3.对外提供公有的静态方法，返回实例对象
	 * @return 实例
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}