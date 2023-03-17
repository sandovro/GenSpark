package com.genspark.employeeDBApp.Service;

import com.genspark.employeeDBApp.Dao.IEmployeeDao;
import com.genspark.employeeDBApp.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int empId) {
        Optional<Employee> e = this.employeeDao.findById(empId);
        Employee employee = null;
        if(e.isPresent())
            employee = e.get();
        else
            throw new RuntimeException("Employee with ID: "+empId+" was not found.");
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployee(int empId) {
        this.employeeDao.deleteById(empId);
        return "Employee successfully deleted";
    }
}
