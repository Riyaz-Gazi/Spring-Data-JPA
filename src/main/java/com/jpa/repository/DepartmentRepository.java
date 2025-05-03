package com.jpa.repository;

import com.jpa.entity.Department;
import com.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByManager(Employee employee);
}
