package com.empyra.empyra_backend.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DuesNotice {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private long id;
	//linked to Unit.java
	private String unit;
	//month/year. Ex: August 2025
	private Date billingMonth;
	private int amount;
	//enum: unpaid, paid, overdue
	private int status;
	//over the counter/ payment channel/ others. put in enum. if others, user should be able to put where. additional textbox in ui maybe
	private String paidVia;
	private long paymentRefNo;
	private Date dueDate;
	private Date paymentDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getBillingMonth() {
		return billingMonth;
	}
	public void setBillingMonth(Date billingMonth) {
		this.billingMonth = billingMonth;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPaidVia() {
		return paidVia;
	}
	public void setPaidVia(String paidVia) {
		this.paidVia = paidVia;
	}
	public long getPaymentRefNo() {
		return paymentRefNo;
	}
	public void setPaymentRefNo(long paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
}
