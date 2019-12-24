package com.etisalat.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etisalat.datatransferobject.DepartmentDTO;
import com.etisalat.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@CrossOrigin(origins = "*")
public class DepartmentController {
	private final DepartmentService departmentService;
	
	public DepartmentController(DepartmentService departmentRepository) {
		this.departmentService = departmentRepository;
	}
	@GetMapping
	public List<DepartmentDTO> getDepartments() {
		return departmentService.getDepartments();
	}
	
	@GetMapping("/{id}")
	public DepartmentDTO getDepartment(@PathVariable int id) throws Exception {
		return departmentService.getDepartment(id);
	}
	
	@PostMapping
	public void createDepartment(@Valid @RequestBody DepartmentDTO departmentDTO) {
		departmentService.createDepartment(departmentDTO);
	}
	
	@PutMapping("/{id}")
	public void updateDepartment(@PathVariable int id, @Valid @RequestBody DepartmentDTO departmentDTO) throws Exception {
		departmentService.updateDepartment(id, departmentDTO);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable int id) throws Exception {
		departmentService.deleteDepartment(id);
	}
	
}
