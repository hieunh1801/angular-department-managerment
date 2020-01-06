package com.example.employee.dao;
import com.example.employee.entities.Position;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDAO extends JpaRepository<Position, Integer>{
	/**
	 * Writing Query here
	 * 
	 * */
}
