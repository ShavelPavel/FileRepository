package com.pavelshevelev.spring.springboot.spring_data_rest.dao;



import com.pavelshevelev.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
