package com.etisalat.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.etisalat.datatransferobject.EmployeeDTO;
import com.etisalat.domainobject.EmployeeDO;

public class EmployeeMapper {

	public static EmployeeDO makeEmployeeDO(EmployeeDTO employeeDTO) {
		return new EmployeeDO(employeeDTO.getEmpId(), employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getEmail(), employeeDTO.getPhone(), employeeDTO.getHireDate(), employeeDTO.getSalary(), employeeDTO.getManagerId(), employeeDTO.getDepartmentId());
	}
	
	public static EmployeeDTO makeEmployeeDTO(EmployeeDO employeeDO) {
		EmployeeDTO.EmployeeDTOBuilder employeeDTOBuilder = EmployeeDTO.newBuilder()
				.setDepartmentId(employeeDO.getDepartmentId())
				.setEmail(employeeDO.getEmail())
				.setEmpId(employeeDO.getEmpId())
				.setFirstName(employeeDO.getFirstName())
				.setLastName(employeeDO.getLastName())
				.setHireDate(employeeDO.getHireDate())
				.setManagerId(employeeDO.getManagerId())
				.setSalary(employeeDO.getSalary())
				.setPhone(employeeDO.getPhone());
		
		return employeeDTOBuilder.createEmployeeDTO();
	}
	
	public static List<EmployeeDTO> makeEmployeeDTOList(Collection<EmployeeDO> employees) {
		return employees.stream()
			.map(EmployeeMapper::makeEmployeeDTO)
			.collect(Collectors.toList());
	}
	
}
