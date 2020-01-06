package com.example.employee.controller;
import com.example.employee.entities.Department;
import com.example.employee.service.DepartmentService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class DepartmentController {
	
	@Autowired
    private DepartmentService departmentService;

    // API TEST_WORKING   http://localhost:8085/api/department/test
	@RequestMapping(value="/department/test", method = RequestMethod.GET)
	public String helloWorld() {
		return "department working"; 
	}

    // API GET_BY_ID http://localhost:8085/api/department/1
	@RequestMapping(value="/department/{id}", method = RequestMethod.GET)
    public Department getById(@PathVariable int id){
		System.out.println(id);
        return departmentService.findDepartmentById(id);
    }

    // API GET_ALL http://localhost:8085/api/departments
	@RequestMapping(value="/departments", method = RequestMethod.GET)
    public List<Department> getAll(){
        return departmentService.findAllDepartment();
    }

    // API SEARCH http://localhost:8085/api/department?searchValue=2
	@RequestMapping(value="/department", method = RequestMethod.GET)
    public List<Department> search(@RequestParam String searchValue){
		System.out.println("serch value: " + searchValue);
        return departmentService.findDepartmentByValue(searchValue);
    }

    // API POST
	@RequestMapping(value="/department", method = RequestMethod.POST)
    public String insert(){
		// TODO
        return "insert";
    }
	
	@RequestMapping(value="/department", method = RequestMethod.PUT)
    public String update(){
        return "update";
    }
	
	@RequestMapping(value="/department/id", method = RequestMethod.DELETE)
    public String delete(){
        return "insert";
    }
	
	
	
	
}
