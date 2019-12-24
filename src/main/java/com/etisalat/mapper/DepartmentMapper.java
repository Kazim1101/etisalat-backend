package com.etisalat.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.etisalat.datatransferobject.DepartmentDTO;
import com.etisalat.domainobject.DepartmentDO;

public class DepartmentMapper {

	public static DepartmentDO makeDepartmentDO(DepartmentDTO departmentDTO) {
		return new DepartmentDO(departmentDTO.getDeptId(), departmentDTO.getDepartmentName(), departmentDTO.getManagerId());
	}
	
	public static DepartmentDTO makeDepartmentDTO(DepartmentDO departmentDO) {
		DepartmentDTO.DepartmentDTOBuilder departmentDTOBuilder = DepartmentDTO.newBuilder()
				.setDepartmentName(departmentDO.getDepartmentName())
				.setDeptId(departmentDO.getDeptId())
				.setManagerId(departmentDO.getManagerId());
		
		return departmentDTOBuilder.createDepartmentDTO();
	}
	
	public static List<DepartmentDTO> makeDepartmentDTOList(Collection<DepartmentDO> employees) {
		return employees.stream()
			.map(DepartmentMapper::makeDepartmentDTO)
			.collect(Collectors.toList());
	}
	
}
