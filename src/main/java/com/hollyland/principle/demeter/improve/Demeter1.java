package com.hollyland.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {

	public static void main(String[] args) {
		System.out.println("~~~ʹ�õ����ط���ĸĽ�~~~");
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}


class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("ѧԺԱ��id= " + i);
			list.add(emp);
		}
		return list;
	}
	
	public void printEmployee() {
		List<CollegeEmployee> list1 = getAllEmployee();
		System.out.println("------------ѧԺԱ��------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("ѧУ�ܲ�Ա��id= " + i);
			list.add(emp);
		}
		return list;
	}

	void printAllEmployee(CollegeManager sub) {
		
		sub.printEmployee();
	
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
