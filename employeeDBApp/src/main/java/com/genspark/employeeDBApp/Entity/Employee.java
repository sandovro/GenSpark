package com.genspark.employeeDBApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
    @Id
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_dept")
    private String empDept;

    public Employee() {
    }

    public Employee(int empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }
}
