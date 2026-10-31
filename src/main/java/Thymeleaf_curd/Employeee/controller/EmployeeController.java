package Thymeleaf_curd.Employeee.controller;
import Thymeleaf_curd.Employeee.model.Employee;
import Thymeleaf_curd.Employeee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }

    @GetMapping("/list")
    public String empList(Model model) {
        model.addAttribute("employee", employeeService.findAll());
        return "employee_list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee_Form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("employee") Employee theEmployee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee_Form";
        }
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("employeeId") int theId, Model model) {
        model.addAttribute("employee",employeeService.findById(theId));
        return "employee_Form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }
}