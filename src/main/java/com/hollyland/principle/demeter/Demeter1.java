package com.hollyland.principle.demeter;

import java.util.ArrayList;
import java.util.List;

//�ͻ���
public class Demeter1 {

	public static void main(String[] args) {
		//������һ�� SchoolManager ����
		SchoolManager schoolManager = new SchoolManager();
		//���ѧԺ��Ա��id ��  ѧУ�ܲ���Ա����Ϣ
		schoolManager.printAllEmployee(new CollegeManager());

	}

}
/**
 * 学校总部员工
 */
class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

/**
 * 学院员工
 */
class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

/**
 * 学院员工的管理类
 */
class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
}

class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("学校总部的员工= " + i);
			list.add(emp);
		}
		return list;
	}

	void printAllEmployee(CollegeManager sub) {
		
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------ѧԺԱ��------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
