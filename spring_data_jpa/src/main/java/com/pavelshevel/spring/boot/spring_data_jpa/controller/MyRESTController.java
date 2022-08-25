package com.pavelshevel.spring.boot.spring_data_jpa.controller;


import com.pavelshevel.spring.boot.spring_data_jpa.entity.Employee;
import com.pavelshevel.spring.boot.spring_data_jpa.service.EployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
@Autowired
    private EployeeService eployeeService;
@GetMapping("/employees")
public List<Employee> showAllEmployees(){
    List<Employee> allEmployees=eployeeService.getAllEmployee();
    return allEmployees;
}
@GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
    Employee employee=eployeeService.getEmployee(id);
    return employee;
}
@PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
    eployeeService.saveEmployee(employee);
    return employee;
}
@PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
    eployeeService.saveEmployee(employee);
    return employee;
}
@DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
    eployeeService.deleteEmployee(id);
    return "Employee with ID = "+id+" was deleted";
}
@GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeesByNAme(@PathVariable String name){
    List<Employee> employees=eployeeService.findAllByName(name);
    return employees;
}
}
