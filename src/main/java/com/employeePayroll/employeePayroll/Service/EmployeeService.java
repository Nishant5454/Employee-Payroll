package com.employeePayroll.employeePayroll.Service;

import com.employeePayroll.employeePayroll.Entity.Employee;
import com.employeePayroll.employeePayroll.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public List<Employee>getallEmployee(){
        return employeeRepo.findAll();
    }

    public Employee getEmployeebyId(Long id){
        return employeeRepo.findById(id).orElse(null);
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public void deleteByid(Long id){
        employeeRepo.deleteById(id);
    }

}
