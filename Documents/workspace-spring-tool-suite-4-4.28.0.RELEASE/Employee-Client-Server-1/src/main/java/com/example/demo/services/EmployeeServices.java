package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee onboard(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted successfully";
	}
}
