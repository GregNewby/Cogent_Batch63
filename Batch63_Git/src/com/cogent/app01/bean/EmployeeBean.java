/**
 * 
 */
package com.cogent.app01.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class EmployeeBean implements Serializable {
	private int employeeNumber;
	private String firstname;
	private String lastname;
	private String email;
	private String extension;
	private int reportsTo;
	private String officeCode;
	private String jobTitle;

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(int employeeNumber, String firstname, String lastname, String email, String extension,
			int reportsTo, String officeCode, String jobTitle) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.extension = extension;
		this.reportsTo = reportsTo;
		this.officeCode = officeCode;
		this.jobTitle = jobTitle;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}


	public String getOfficeCode() {
		return officeCode;
	}


	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(email, employeeNumber, extension, firstname, jobTitle, lastname, officeCode, reportsTo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		return Objects.equals(email, other.email) && employeeNumber == other.employeeNumber
				&& Objects.equals(extension, other.extension) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(officeCode, other.officeCode) && reportsTo == other.reportsTo;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeNumber=" + employeeNumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", extension=" + extension + ", reportsTo=" + reportsTo + ", officeCode="
				+ officeCode + ", jobTitle=" + jobTitle + "]";
	}


	
	

}