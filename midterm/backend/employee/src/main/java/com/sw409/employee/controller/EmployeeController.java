package com.sw409.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.employee.models.Employee;
import com.sw409.employee.services.EmployeeServices;



@RestController
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	EmployeeServices empService = new EmployeeServices();
	
	//Create
	@PostMapping("api/v1/employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return empService.createEmployee(employee);
	}
	
	//Read
	@GetMapping("api/v1/employees")
	public List<Employee> findAllEmployees()
	{
		return empService.findAllEmployees();
	}
	
	//Update
	@PutMapping("api/v1/employees/{employeeid}")
	public void updateEmplyee(@PathVariable("employeeid") Integer id, @RequestBody Employee employee)
	{
		empService.updateEmployee(id, employee);
	}
	
	//Delete
	@DeleteMapping("api/v1/employees/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") Integer id)
	{
		empService.deleteEmployee(id);
	}
	

}
