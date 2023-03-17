package com.genspark.employeeDBApp.Service;

import com.genspark.employeeDBApp.Entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int empId);
}
