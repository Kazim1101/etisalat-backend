package com.etisalat.service;

import java.util.List;
import java.util.Optional;

import com.etisalat.datatransferobject.EmployeeDTO;

public interface EmployeeService {
	
	List<EmployeeDTO> findEmployees();
	
	EmployeeDTO findEmployee(Integer id) throws Exception;
	
	void createEmployee(EmployeeDTO employeeDTO);
	
	void updateEmployee(Integer id, EmployeeDTO employeeDTO) throws Exception;
	
	void deleteEmployee(Integer id) throws Exception;
	
}
