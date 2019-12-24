package com.etisalat.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etisalat.dataaccessobject.DepartmentRepository;
import com.etisalat.datatransferobject.DepartmentDTO;
import com.etisalat.domainobject.DepartmentDO;
import com.etisalat.mapper.DepartmentMapper;
import com.etisalat.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	private final DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<DepartmentDTO> getDepartments() {
		return DepartmentMapper.makeDepartmentDTOList((Collection<DepartmentDO>) departmentRepository.findAll());
	}

	@Override
	public DepartmentDTO getDepartment(Integer id) throws Exception {
		DepartmentDO var1 = validate(id);
		return DepartmentMapper.makeDepartmentDTO(var1);
	}

	@Override
	public void createDepartment(DepartmentDTO departmentDTO) {
		departmentRepository.save(DepartmentMapper.makeDepartmentDO(departmentDTO));
	}

	@Override
	public void updateDepartment(Integer id, DepartmentDTO departmentDTO) throws Exception {
		DepartmentDO var1 = validate(id);
		
		var1.setDepartmentName(departmentDTO.getDepartmentName());
		var1.setDeptId(id);
		var1.setManagerId(departmentDTO.getManagerId());
		
		departmentRepository.save(var1);
	}

	@Override
	public void deleteDepartment(Integer id) throws Exception {
		validate(id);
		departmentRepository.deleteById(id);
	}
	
	private DepartmentDO validate(int id) throws Exception {
		return departmentRepository.findById(id).orElseThrow(() -> new Exception("Entity not found"));
	}

}
