package com.intelizest.projectIZ.Controller;

import com.intelizest.projectIZ.Model.Employee;
import com.intelizest.projectIZ.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    //  private EmployeeRepository employeeRepository;
            EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    private Employee getEmployee(@PathVariable("id") int id)
    {
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/employees/{id}")
    private void deleteEmployee(@PathVariable("id") int id)
    {
        employeeService.delete(id);
    }
    @PostMapping("/employee")
    private int saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee.getid();
    }
    @PutMapping("/employee")
    private Employee update(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee;
    }
}
