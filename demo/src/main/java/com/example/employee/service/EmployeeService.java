package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeDAO employeeDAO;
	
	public List<Employee> getAll() {
		return employeeDAO.findAll();
	}
}
