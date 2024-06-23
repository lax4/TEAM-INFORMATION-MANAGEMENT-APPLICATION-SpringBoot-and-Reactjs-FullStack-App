package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.EmployeeModel;
import com.rest.services.EmployeeServiceImp;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:5173/"})
public class EmployeeController {
	@Autowired
	private EmployeeServiceImp employeeServiceimp;

	// add employee rest API
	@PostMapping("/employees")
	public EmployeeModel addEmp(@RequestBody EmployeeModel employeeModel) {
		EmployeeModel savedata = employeeServiceimp.saveEmployeer(employeeModel);
		return savedata;
	}
	@GetMapping("/employees")
	public List<EmployeeModel> allEmployeeDetails(){
		List<EmployeeModel> dataEmp=employeeServiceimp.getAllEmp();
		return dataEmp;
	}
	@PutMapping("/employees/{id}")
	public EmployeeModel updateOneRecord(@PathVariable Long id,@RequestBody EmployeeModel employeeModel) {
		EmployeeModel dataUpdate=employeeServiceimp.updateEmployee(id, employeeModel);
		return dataUpdate;
	}
	@DeleteMapping("/employees/{id}")
	public void deleteOneRecord(@PathVariable Long id) {
		 employeeServiceimp.deleteEmployee(id);
	}

}
