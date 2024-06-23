package com.rest.services;

import java.util.List;

import com.rest.model.EmployeeModel;

public interface EmployeeService {
	//add employee details//
	 public EmployeeModel saveEmployeer(EmployeeModel employeeModel);
	 
	 public List<EmployeeModel> getAllEmp();
	 
	 //update one employee details//
	 public EmployeeModel updateEmployee(Long id,EmployeeModel employeeModel);
	 
	 //delete one record //
	 public void deleteEmployee(Long id);
}
