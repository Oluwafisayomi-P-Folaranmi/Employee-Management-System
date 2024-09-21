package com.opf.student_management_system.service;

import java.util.List;

import com.opf.student_management_system.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

}
