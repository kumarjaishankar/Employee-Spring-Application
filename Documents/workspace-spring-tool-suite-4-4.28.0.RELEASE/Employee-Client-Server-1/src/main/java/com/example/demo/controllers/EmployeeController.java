package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;
	
	@PostMapping("/api/onboard")
	public Employee onboard(@RequestBody Employee employee) {
		return employeeServices.onboard(employee);
	}
	
	@GetMapping("/api/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeServices.getEmployee(id);
	}
	
	@GetMapping("/api/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeServices.getAllEmployee();
	}
	
	@PutMapping("/api/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeServices.updateEmployee(employee);
	}
	
	@DeleteMapping("/api/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeServices.deleteEmployee(id);
	}
}
