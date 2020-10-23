package com.sw409.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.sw409.employee.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
