package com.employeePayroll.employeePayroll.Repository;

import com.employeePayroll.employeePayroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
