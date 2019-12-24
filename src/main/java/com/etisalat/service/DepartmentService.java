package com.etisalat.service;

import java.util.List;

import com.etisalat.datatransferobject.DepartmentDTO;

public interface DepartmentService {

	List<DepartmentDTO> getDepartments();
	
	DepartmentDTO getDepartment(Integer id) throws Exception;
	
	void createDepartment(DepartmentDTO departmentDTO);
	
	void updateDepartment(Integer id, DepartmentDTO departmentDTO) throws Exception;
	
	void deleteDepartment(Integer id) throws Exception;
	
}
