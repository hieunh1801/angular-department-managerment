package com.example.employee.dao;
import com.example.employee.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
}
