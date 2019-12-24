package com.etisalat.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.etisalat.datatransferobject.EmployeeDTO;
import com.etisalat.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeDTO> getEmployees() {
		return employeeService.findEmployees();
	}
	
	@GetMapping("/{id}")
	public EmployeeDTO getEmployee(@PathVariable int id) throws Exception {
		return employeeService.findEmployee(id);
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
		employeeService.createEmployee(employeeDTO);
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeeDTO employeeDTO) throws Exception {
		employeeService.updateEmployee(id, employeeDTO);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) throws Exception {
		employeeService.deleteEmployee(id);
	}
	
}
