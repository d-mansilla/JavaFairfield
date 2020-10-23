package com.sw409.employee.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.employee.models.Employee;
import com.sw409.employee.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	
	List<Employee> employeeList = new ArrayList<>();
	@Autowired
	EmployeeRepository employeeRepository;

	
	
	
	//create
	public Employee createEmployee(Employee employee)
	{
		
		employeeList.add(employee);
		return employeeRepository.save(employee);
		
	}
	
	//read
	public List<Employee> findAllEmployees()
	{
		return (List<Employee>) (employeeRepository.findAll());
	}
	
	//update
	public void updateEmployee(Integer id, Employee employee)
	{
		
		Employee oldemployee = employeeRepository.findById(id).get();
		
		
		oldemployee.setName(employee.getName());
		
		oldemployee.setTitle(employee.getTitle());
		
		employeeRepository.save(employee);
		
		for (int i = 0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getId().equals(id))
			{
				employeeList.set(i, employee);
			}
		}
	}
	
	//delete
	public void deleteEmployee(Integer id)
	{
		
		employeeRepository.deleteById(id);
		
//		for (int i = 0; i < employeeList.size(); i++) {
//			if(employeeList.get(i).getId().equals(id))
//			{
//				employeeList.remove(i);
//			}
//		}
	}

}
