package com.empyra.enums;

public enum UserStatus {
	
	ACTIVE(1, "Active"),
	INACTIVE(2, "Inactive"),
	SUSPENDED(3, "Suspended"),
	DELETED(4, "Deleted");
	
	
	private final int code;
	private final String description;
	
	
	UserStatus(int code, String description) {
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
