package com.jpa.controller;

import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee employee){
        return employeeService.createNewEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable(value = "employeeId") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

}
