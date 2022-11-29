package com.hollyland.builder.improve;

/**
 * 指挥者，这里去指定制作流程，返回产品
 */
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	/**
	 * 构造器传入houseBuilder
	 * @param houseBuilder
	 */
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * 通过setter传入houseBuilder
	 * @param houseBuilder
	 */
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//��δ����췿�ӵ����̣�����ָ����
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
	
	
}
