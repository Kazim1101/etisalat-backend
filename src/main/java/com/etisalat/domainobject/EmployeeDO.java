package com.etisalat.domainobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "employees")
public class EmployeeDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(length = 20)
	@NotNull
	@Size(min = 3)
	private String firstName;
	
	@Column(length = 25)
	@NotNull
	@Size(min = 3)
	private String lastName;
	
	@Column(length = 25)
	private String email;
	
	@Column(name = "phone_number", length = 20)
	@Pattern(regexp = "^[0-9]*\\-[0-9]*$")
	private String phone;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	
	@Column(precision = 8, scale = 2)
	@Type(type = "big_decimal")
	@DecimalMin(value = "0.0", inclusive = false)
	private BigDecimal salary;

	@Column
	private Integer managerId;
	
	@Column
	private Integer departmentId;

	public EmployeeDO() {
		
	}

	public EmployeeDO(Integer empId, String firstName, String lastName, String email, String phone, Date hireDate,
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
		return "EmployeeDO [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", hireDate=" + hireDate + ", salary=" + salary + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + "]";
	}
	
}
