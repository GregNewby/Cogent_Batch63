/**
 * 
 */
package com.cogent.boot.EmployeeManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Entity
@Table(name="payroll")
public class Payroll {
	
	@Id
	private int id;
	private String name;
	private double amount;
	private double taxesPaid;
	private int hoursWorked;
	
	public Payroll() {
		super();
	}

	public Payroll(int id, String name, double amount, double taxesPaid, int hoursWorked) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxesPaid = taxesPaid;
		this.hoursWorked = hoursWorked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTaxesPaid() {
		return taxesPaid;
	}

	public void setTaxesPaid(double taxesPaid) {
		this.taxesPaid = taxesPaid;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "Payroll [id=" + id + ", name=" + name + ", amount=" + amount + ", taxesPaid=" + taxesPaid
				+ ", hoursWorked=" + hoursWorked + "]";
	}
	
	
	

}
