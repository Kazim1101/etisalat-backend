package com.etisalat.domainobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentDO implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;
	
	@Column(length = 30)
	private String departmentName;
	
	@Column
	private Integer managerId;

	public DepartmentDO() {

	}

	public DepartmentDO(Integer deptId, String departmentName, Integer managerId) {
		super();
		this.deptId = deptId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "DepartmentDO [deptId=" + deptId + ", departmentName=" + departmentName + ", managerId=" + managerId
				+ "]";
	}
	
}
