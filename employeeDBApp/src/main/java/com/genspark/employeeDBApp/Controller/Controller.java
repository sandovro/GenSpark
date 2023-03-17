package com.genspark.employeeDBApp.Controller;

import com.genspark.employeeDBApp.Entity.Employee;
import com.genspark.employeeDBApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(){
        return "Welcome to the Employee Application";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable String empId) {
        return this.employeeService.getEmployeeById(Integer.parseInt(empId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteEmployee(@PathVariable String empId) {
        return this.employeeService.deleteEmployee(Integer.parseInt(empId));
    }

}

