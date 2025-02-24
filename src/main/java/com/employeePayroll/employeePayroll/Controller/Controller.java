package com.employeePayroll.employeePayroll.Controller;

import com.employeePayroll.employeePayroll.Entity.Employee;
import com.employeePayroll.employeePayroll.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class Controller {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public List<Employee>getallEmployee(){
        return employeeService.getallEmployee();
    }
    @GetMapping({"get/{id}"})
    public Employee getEmployeebyId(@PathVariable Long id){
        return employeeService.getEmployeebyId(id);
    }
    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee){
       return  employeeService.saveEmployee(employee);
    }
    @PutMapping({"put/{id}"})
    public Employee updateEmployeebyId(@PathVariable Long id,@RequestBody Employee employee){
        Employee existingEmployee= employeeService.getEmployeebyId(id);
        if(existingEmployee!=null){
            existingEmployee.setname(employee.getName());
            existingEmployee.setid(employee.getId());
            existingEmployee.setSalary(existingEmployee.getSalary());
            return employeeService.saveEmployee(existingEmployee);

    }
        return null;
}
@DeleteMapping({"delete/{id}"})
public void deleteEmployee(@PathVariable Long id){

        employeeService.deleteByid(id);
    }
}
