/**
 * 
 */
package com.itmatrix.servlet.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;

public class EmployeeDao implements Callable<List<Employee>>{
	
	private int i = 0;
	
	public EmployeeDao(int i)
	{
		this.i = i;
	}

	public List<Employee> call() throws Exception {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long time = cal.getTimeInMillis();
		//System.out.println(i + " -- " + time);
		List<Employee> employeeList = new ArrayList<Employee>();
		for(int j = i;j<j+10;j++)
		{ 
			Employee employee = new Employee();
			employee.setEmployeeName("Manjunath Reddy");
			employee.setEmployeeAddress("Vagarur"+j);
			employeeList.add(employee);
		}
		
		return employeeList;
	}
	
	

}
