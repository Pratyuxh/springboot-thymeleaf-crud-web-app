package com.pratyush.backend.service;

import com.pratyush.backend.model.Employee;
import com.pratyush.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {

        return null;
    }
}
