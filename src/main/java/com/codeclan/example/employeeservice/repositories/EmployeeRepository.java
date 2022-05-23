package com.codeclan.example.employeeservice.repositories;

import com.codeclan.example.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
