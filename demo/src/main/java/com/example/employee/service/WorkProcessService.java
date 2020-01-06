package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.WorkProcessDAO;
import com.example.employee.entities.WorkProcess;

@Service
public class WorkProcessService {
	@Autowired
    private WorkProcessDAO workProcessDAO;
	
	public List<WorkProcess> getAll() {
		return workProcessDAO.findAll();
	}
	
}
