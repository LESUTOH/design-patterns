package com.hollyland.composite;

public abstract class OrganizationComponent {
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 说明
	 */
	private String des;
	
	protected  void add(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	protected  void remove(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}

	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	protected abstract void print();
	
	
}
