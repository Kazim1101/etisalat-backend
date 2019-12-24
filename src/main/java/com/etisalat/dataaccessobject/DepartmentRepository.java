package com.etisalat.dataaccessobject;

import org.springframework.data.repository.CrudRepository;

import com.etisalat.domainobject.DepartmentDO;

public interface DepartmentRepository extends CrudRepository<DepartmentDO, Integer> {

}
