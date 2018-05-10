/**
 * 
 */
package com.itmatrix.servlet.action;

import java.util.List;

/**
 * @author manju
 *
 */
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		EmployeeExecuteService employeeExecuteService = new EmployeeExecuteService();
		List<Employee> employeeList = employeeExecuteService.getEmployeDetails();
		for(Employee employee : employeeList)
		{
			System.out.println("Employee Address "+employee.getEmployeeAddress());
		}
		
	}

}
