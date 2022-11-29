package com.hollyland.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}

}


class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "公路运行");
	}
}
