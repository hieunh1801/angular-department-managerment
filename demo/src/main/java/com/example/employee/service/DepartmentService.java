package com.example.employee.service;
import com.example.common.DatetimeHelper;
import java.util.List;

import com.example.employee.dto.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.DepartmentDAO;
import com.example.employee.entities.Department;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    /**
     * Find all Department
     *
     * @return
     */
    public List<Department> findAllDepartment() {

        return departmentDAO.findAllDepartment();
    }

    public Department findDepartmentById(int id) {
        return departmentDAO.findDepartmentById(id);
    }

    public List<Department> findDepartmentByValue(String value) {
        return departmentDAO.findByValue(value);
    }

    /**
     * Thêm một phòng ban
     * @param departmentDTO
     *  >>> code: mã phòng ban
     *  >>> name: tên phòng ban
     * @param username - người đang login
     */
    public void insertDepartment(DepartmentDTO departmentDTO, String username) {
        DatetimeHelper datetimeHelper = new DatetimeHelper();
        Department department = new Department(departmentDTO.getCode(), departmentDTO.getName(), 1, datetimeHelper.CurrentDate(), datetimeHelper.CurrentDate(), username, username);
    }


}
