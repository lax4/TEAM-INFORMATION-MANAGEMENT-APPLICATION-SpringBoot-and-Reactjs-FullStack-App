package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.EmployeeModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel,Long> {

}
