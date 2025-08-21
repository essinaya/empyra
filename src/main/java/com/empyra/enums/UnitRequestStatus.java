package com.empyra.enums;

public enum UnitRequestStatus {
	
	PENDING(0, "Pending"),
	APPROVED(1, "Approved"),
	IN_PROGRESS(2, "In Progress"),
	DONE(3, "Done");
	
	private final int code;
	
	private final String description;
	
	UnitRequestStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
}
