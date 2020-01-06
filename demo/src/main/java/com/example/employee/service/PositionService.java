package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.dao.PositionDAO;
import com.example.employee.entities.Position;

@Service
public class PositionService {
	@Autowired
    private PositionDAO positionDAO;
	
	public List<Position> getAll() {
		return positionDAO.findAll();
	}
}
