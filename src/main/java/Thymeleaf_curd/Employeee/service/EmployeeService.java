package Thymeleaf_curd.Employeee.service;

import Thymeleaf_curd.Employeee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();
    Optional<Employee>findById(Integer id);
    Employee save(Employee theEmployee);
    void deleteById(Integer id);
    
}
