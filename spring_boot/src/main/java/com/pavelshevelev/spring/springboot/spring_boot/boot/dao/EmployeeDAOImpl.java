package com.pavelshevelev.spring.springboot.spring_boot.boot.dao;


import com.pavelshevelev.spring.springboot.spring_boot.boot.entity.Employee;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl  implements EmployeeDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {

//        Session session=entityManager.unwrap(Session.class);
//        Query<Employee> query= session.createQuery("from employees "
//                ,Employee.class);
//        List<Employee> allEmploees=query.getResultList();
        Query query=entityManager.createQuery("from employees");
        List<Employee> allEmploees=query.getResultList();

        return allEmploees;
    }


    @Override
    public void saveEmployee(Employee employee) {
//        Session session=entityManager.unwrap(Session.class);
//
//     session.saveOrUpdate(employee);
        Employee newEmployee =entityManager.merge(employee);
        employee.setId(newEmployee.getId());

    }

    @Override
    public Employee getEmployee(int id) {
//        Session session=entityManager.unwrap(Session.class);
//
//        Employee employee=session.get(Employee.class, id);

        Employee employee=entityManager.find(Employee.class,id);
        return employee;

    }

    @Override
    public void deleteEmployee(int id) {
//        Session session=entityManager.unwrap(Session.class);
//
//        Query<Employee> query=session.createQuery(
//                "delete from employees " +
//                "where id =:employeeId");
//        query.setParameter("employeeId",id);
//        query.executeUpdate();
        Query query=entityManager.createQuery(
                "delete from employees " +
                "where id =:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();

    }
}
