package com.hollyland.bridge;

public class UpRightPhone extends Phone {

	/**
	 * 构造器
	 * @param brand
	 */
	public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
