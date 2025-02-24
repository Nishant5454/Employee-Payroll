package com.employeePayroll.employeePayroll.Repository;

import com.employeePayroll.employeePayroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


// uc2 using sql
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
