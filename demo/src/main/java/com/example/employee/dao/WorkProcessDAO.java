package com.example.employee.dao;
import com.example.employee.entities.WorkProcess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkProcessDAO extends JpaRepository<WorkProcess, Integer>{

}
