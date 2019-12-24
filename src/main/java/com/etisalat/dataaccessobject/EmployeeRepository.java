package com.etisalat.dataaccessobject;

import org.springframework.data.repository.CrudRepository;

import com.etisalat.domainobject.EmployeeDO;

public interface EmployeeRepository extends CrudRepository<EmployeeDO, Integer> {

}
