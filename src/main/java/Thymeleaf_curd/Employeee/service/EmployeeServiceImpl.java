package Thymeleaf_curd.Employeee.service;

import Thymeleaf_curd.Employeee.model.Employee;
import Thymeleaf_curd.Employeee.repository.EmployeeJPA;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeJPA employeeJPA;

    public EmployeeServiceImpl(EmployeeJPA employeeJPA) {
        this.employeeJPA = employeeJPA;
    }

    @Override
    public List<Employee> findAll() {
        return employeeJPA.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeJPA.findById(id);
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeJPA.save(theEmployee);
    }

    @Override
    public void deleteById(Integer id) {

        employeeJPA.deleteById(id);

    }


}
