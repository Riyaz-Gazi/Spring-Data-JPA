package com.jpa.service;

import com.jpa.entity.Department;
import com.jpa.entity.Employee;
import com.jpa.repository.DepartmentRepository;
import com.jpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public Department createNewDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department assignManagerToDepartment(Long departmentId, Long employeeId) {
        Optional<Department> optionalDepartment = departmentRepository.findById(departmentId);
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        return optionalDepartment.flatMap(department ->
                optionalEmployee.map(employee -> {
                    department.setManager(employee);
                    return departmentRepository.save(department);
                })).orElse(null);

    }

    public Department getAssignedDepartmentOfManager(Long employeeId) {
//        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
//        return optionalEmployee.map(Employee::getManagedDepartment).orElse(null);

        Employee employee = Employee.builder().id(employeeId).build();

        return departmentRepository.findByManager(employee);
    }

    public Department assignWorkerToDepartment(Long departmentId, Long employeeId) {
        Optional<Department> optionalDepartment = departmentRepository.findById(departmentId);
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        return optionalDepartment.flatMap(department ->
                optionalEmployee.map(employee -> {
                    employee.setWorkerDepartment(department);
                    employeeRepository.save(employee);
                    department.getWorkers().add(employee);
                    return department;
                })).orElse(null);
    }

    public Department assignFreelancerToDepartment(Long departmentId, Long employeeId) {
        Optional<Department> optionalDepartment = departmentRepository.findById(departmentId);
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        return optionalDepartment.flatMap(department ->
                optionalEmployee.map(employee -> {
                    employee.getFreelanceDepartments().add(department);
                    employeeRepository.save(employee);
                    department.getFreelancers().add(employee);
                    return department;
                })).orElse(null);
    }
}
