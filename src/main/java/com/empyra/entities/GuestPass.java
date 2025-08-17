package com.empyra.entities;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class GuestPass {
	
	private long id;
	//linked from Unit.java
	private String unit;
	private String guestName;
	private Date visitDate;
	private String createdBy;
	private int status;
	private String approvedBy;
	
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
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	
	
	
//	Field Name	Description
//	id	Unique ID
//	unit	Linked Unit
//	guestName	Name of guest
//	visitDate	Scheduled visit date/time
//	createdBy	User who submitted the request
//	status	PENDING / APPROVED / DENIED / EXPIRED
//	approvedBy	Security staff who approved it (if any)
}
