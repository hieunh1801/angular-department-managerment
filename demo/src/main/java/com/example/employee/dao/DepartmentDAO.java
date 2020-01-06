package com.example.employee.dao;
import com.example.employee.entities.Department;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface DepartmentDAO extends JpaRepository<Department, Integer> {
	
	// Select all	
	@Query(value = "select * from department", nativeQuery = true)
	List<Department> findAllDepartment();
	
	// select by id
	@Query( value= "select * from department d where id = :id", nativeQuery = true)
	Department findDepartmentById(@Param("id") int id);
	
	// select by value on multiple column
	@Query( value="CALL sp_department_search(:value)", nativeQuery=true)
	List<Department> findByValue(@Param("value")String value);


}	

