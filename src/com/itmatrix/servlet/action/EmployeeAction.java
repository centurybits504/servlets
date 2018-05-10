/**
 * 
 */
package com.itmatrix.servlet.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author manju
 *
 */
public class EmployeeAction extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8888888673098285525L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/http");
		
		EmployeeExecuteService employeeExecuteService = new EmployeeExecuteService();
		List<Employee> employeeList = employeeExecuteService.getEmployeDetails();
		for(Employee employee : employeeList)
		{
			System.out.println("Employee Address "+employee.getEmployeeAddress());
		}
		

	}

}
