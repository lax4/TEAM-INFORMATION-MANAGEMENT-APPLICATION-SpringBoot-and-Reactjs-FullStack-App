package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.EmployeeModel;
import com.rest.repository.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeModel saveEmployeer(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		EmployeeModel dataSave =employeeRepo.save(employeeModel);
		return dataSave;
	}

	@Override
	public List<EmployeeModel> getAllEmp() {
		// TODO Auto-generated method stub
		List<EmployeeModel> empData=employeeRepo.findAll();
		return empData;
	}

	@Override
	public EmployeeModel updateEmployee(Long id, EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		EmployeeModel getOneRecord=employeeRepo.findById(id).get();
		getOneRecord.setName(employeeModel.getName());
		getOneRecord.setEmail(employeeModel.getEmail());
		getOneRecord.setGender(employeeModel.getGender());
		getOneRecord.setDeptno(employeeModel.getDeptno());
		
		return employeeRepo.save(getOneRecord);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		
		
	}

}
