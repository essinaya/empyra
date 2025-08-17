package com.empyra.entities;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Violation {
	//feature: User has a record for getting their past violations

	private long id;
	//linked from Unit.java
	private String unit;
	private String reportedBy;
	private String description;
	private Date dateReported;
	//MINOR, MODERATE, MAJOR, CRITICAL. put in enum. also put colored dot in UI
	private int severity;
	//true and false should be in enum
	private boolean resolved;
	
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
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateReported() {
		return dateReported;
	}
	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

	
	
}
