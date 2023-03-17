package com.genspark.employeeDBApp.Dao;

import com.genspark.employeeDBApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee,Integer> {
}
