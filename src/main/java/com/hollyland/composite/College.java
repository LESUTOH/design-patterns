package com.hollyland.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lesuto
 */
public class College extends OrganizationComponent {

    /**
     * List中存放的Department
     */
	List<OrganizationComponent> organizationComponents = new ArrayList<>();

	/**
	 * 构造器
	 * @param name
	 * @param des
	 */
	public College(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// 将来实际业务中，College的add和University add不一定完全一样
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("--------------" + getName() + "--------------");
		//���� organizationComponents 
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}


}
