package com.etisalat.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.etisalat.dataaccessobject.EmployeeRepository;
import com.etisalat.datatransferobject.EmployeeDTO;
import com.etisalat.domainobject.EmployeeDO;
import com.etisalat.mapper.EmployeeMapper;
import com.etisalat.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeDTO> findEmployees() {
		return EmployeeMapper.makeEmployeeDTOList((Collection<EmployeeDO>) employeeRepository.findAll());
	}

	@Override
	public EmployeeDTO findEmployee(Integer id) throws Exception {
		EmployeeDO var1 = validate(id);
		
		return EmployeeMapper.makeEmployeeDTO(var1);
	}

	@Override
	public void createEmployee(EmployeeDTO employeeDTO) {
		employeeRepository.save(EmployeeMapper.makeEmployeeDO(employeeDTO));
	}

	@Override
	public void updateEmployee(Integer id, EmployeeDTO employeeDTO) throws Exception {
		EmployeeDO var1 = validate(id);
		
		var1.setDepartmentId(employeeDTO.getDepartmentId());
		var1.setEmail(employeeDTO.getEmail());
		var1.setEmpId(id);
		var1.setFirstName(employeeDTO.getFirstName());
		var1.setHireDate(employeeDTO.getHireDate());
		var1.setLastName(employeeDTO.getLastName());
		var1.setManagerId(employeeDTO.getManagerId());
		var1.setPhone(employeeDTO.getPhone());
		var1.setSalary(employeeDTO.getSalary());
		
		employeeRepository.save(var1);
	}

	@Override
	public void deleteEmployee(Integer id) throws Exception {
		EmployeeDO var1 = validate(id);
		employeeRepository.deleteById(id);
	}
	
	private EmployeeDO validate(int id) throws Exception {
		return employeeRepository.findById(id).orElseThrow(() -> new Exception("Entity not found"));
	}

}
