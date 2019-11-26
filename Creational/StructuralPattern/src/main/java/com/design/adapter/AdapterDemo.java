package com.design.adapter;

import java.util.List;

/**
 * The Class AdapterDemo.
 */
public class AdapterDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
	}
}
