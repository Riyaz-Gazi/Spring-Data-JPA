package com.jpa.controller;

import com.jpa.entity.Department;
import com.jpa.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department createNewDepartment(@RequestBody Department department){
        return departmentService.createNewDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable(value = "departmentId") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping(path = "/{departmentId}/manager/{employeeId}")
    public Department assignManagerToDepartment(@PathVariable Long departmentId,@PathVariable Long employeeId){
        return departmentService.assignManagerToDepartment(departmentId,employeeId);
    }

    @GetMapping(path = "/assignedDepartmentOfManager/{employeeId}")
    public Department getAssignedDepartmentOfManager(@PathVariable Long employeeId){
        return departmentService.getAssignedDepartmentOfManager(employeeId);
    }

    @PutMapping(path = "/{departmentId}/worker/{employeeId}")
    public Department assignWorkerToDepartment(@PathVariable Long departmentId,@PathVariable Long employeeId){
        return departmentService.assignWorkerToDepartment(departmentId,employeeId);
    }

    @PutMapping(path = "/{departmentId}/freelancers/{employeeId}")
    public Department assignFreelancerToDepartment(@PathVariable Long departmentId,@PathVariable Long employeeId){
        return departmentService.assignFreelancerToDepartment(departmentId,employeeId);
    }


}
