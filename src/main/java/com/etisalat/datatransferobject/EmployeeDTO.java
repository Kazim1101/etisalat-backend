package com.etisalat.datatransferobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class EmployeeDTO {
	private Integer empId;

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phone;
	
	private Date hireDate;
	
	private BigDecimal salary;
	
	private Integer managerId;
	
	private Integer departmentId;
	
	public EmployeeDTO() {}

	public EmployeeDTO(Integer empId, String firstName, String lastName, String email, String phone, Date hireDate,
			BigDecimal salary, Integer managerId, Integer departmentId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.hireDate = hireDate;
		this.salary = salary;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", hireDate=" + hireDate + ", salary=" + salary + ", managerId="
				+ managerId + ", departmentId=" + departmentId + "]";
	}
	
	public static EmployeeDTOBuilder newBuilder() {
		return new EmployeeDTOBuilder();
	}
	
	public static class EmployeeDTOBuilder {
		private Integer empId;
		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		private Date hireDate;
		private BigDecimal salary;
		private Integer managerId;		
		private Integer departmentId;
		
		public EmployeeDTOBuilder setEmpId(Integer empId) {
			this.empId = empId;
			return this;
		}
		
		public EmployeeDTOBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public EmployeeDTOBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public EmployeeDTOBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public EmployeeDTOBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public EmployeeDTOBuilder setHireDate(Date hireDate) {
			this.hireDate = hireDate;
			return this;
		}
		
		public EmployeeDTOBuilder setSalary(BigDecimal salary) {
			this.salary = salary;
			return this;
		}
		
		public EmployeeDTOBuilder setManagerId(Integer managerId) {
			this.managerId = managerId;
			return this;
		}
		
		public EmployeeDTOBuilder setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
			return this;
		}
		
		public EmployeeDTO createEmployeeDTO() {
			return new EmployeeDTO(empId, firstName, lastName, email, phone, hireDate, salary, managerId, departmentId);
		}
		
		
	}
	
}
