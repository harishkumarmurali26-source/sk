package Thymeleaf_curd.Employeee.repository;

import Thymeleaf_curd.Employeee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJPA extends JpaRepository<Employee,Integer> {

}
