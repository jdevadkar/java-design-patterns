package com.design.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "Ram", "Dev", "ram@dev.com");
		employees.add(employeeFromDB);
		
		EmployeeLdap employeeFromLdap =new EmployeeLdap("dev", "ram", "kan", "kan@ram.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV =new EmployeeCSV("1235,dev,ram,dev@ram.com");
		employees.add(new EmployeeAdapterCVS(employeeFromCSV));
		return employees;
	}
}
