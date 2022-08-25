package com.pavelshevelev.spring.springboot.spring_boot.boot.service;


import com.pavelshevelev.spring.springboot.spring_boot.boot.entity.Employee;

import java.util.List;

public interface EployeeService {
    public List<Employee> getAllEmployee();

    public void  saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);


}
