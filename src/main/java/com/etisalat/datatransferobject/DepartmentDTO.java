package com.etisalat.datatransferobject;

public class DepartmentDTO {
	private Integer deptId;
	
	private String departmentName;
	
	private Integer managerId;

	public DepartmentDTO() {}

	public DepartmentDTO(Integer deptId, String departmentName, Integer managerId) {
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
	
	public static DepartmentDTOBuilder newBuilder() {
		return new DepartmentDTOBuilder();
	}

	public static class DepartmentDTOBuilder {
		private Integer deptId;
		private String departmentName;
		private Integer managerId;
		
		public DepartmentDTOBuilder setDeptId(Integer deptId) {
			this.deptId = deptId;
			return this;
		}
		
		public DepartmentDTOBuilder setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
			return this;
		}
		
		public DepartmentDTOBuilder setManagerId(Integer managerId) {
			this.managerId = managerId;
			return this;
		}
		
		public DepartmentDTO createDepartmentDTO() {
			return new DepartmentDTO(deptId, departmentName, managerId);
		}
		
	}
	
}
