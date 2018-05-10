/**
 * 
 */
package com.itmatrix.servlet.action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author manju
 *
 */
public class EmployeeExecuteService {

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeDetails() {
		List<Employee> employeeList = new ArrayList<Employee>();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Object> futureList = new ArrayList<Object>();
		
		for (int i = 0; i < 10; i++) {
			Callable<List<Employee>> callable = new EmployeeDao(i);
			Future<List<Employee>> future = executorService.submit(callable);
			futureList.add(future);
		}

		for (Object future : futureList) {
			try {
				Employee employee_1 = (Employee) ((Future<List<Employee>>) future).get();
				employeeList.add(employee_1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return employeeList;
	}

}
